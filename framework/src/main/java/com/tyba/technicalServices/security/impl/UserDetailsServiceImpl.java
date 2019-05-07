
package com.tyba.technicalServices.security.impl;

import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;
import com.tyba.technicalServices.security.RoleEntity;
import com.tyba.technicalServices.security.UserEntity;

/**
 * An incomplete implementation of Spring Security's UserDetailsService...
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private ILogger logger = SL4JLogger.getInstance(UserDetailsServiceImpl.class);
    private SecurityDaoJpa securityDaoJpa; 

	@Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        if (username == null || username.isEmpty()) {
        	logger.error("Empty username");
            throw new UsernameNotFoundException("Empty username"); 
        }
        //Load user from database
        UserEntity userEntity = securityDaoJpa.findByUserName(username);

        String password = username;
//        GrantedAuthority[] authorities = toGrantedAuthorities(username);
        GrantedAuthority[] authorities = toGrantedAuthorities(userEntity.getRoles());
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        
        User user = new User(username, userEntity.getPassword(), enabled, accountNonExpired,credentialsNonExpired, accountNonLocked, authorities);
        return user;
    }

//    /**
//     * Implement your authorities retrieval mechanism here
//     */
//    private GrantedAuthority[] toGrantedAuthorities(String username) {
//        logger.warning("TODO: you should load your real user here...");
//        if ("admin".equalsIgnoreCase(username)) {
//            return toGrantedAuthorities("ROLE_USER", "ROLE_ADMIN");
//        } else {
//            return toGrantedAuthorities("ROLE_USER");
//        }
//    }
//
//    private GrantedAuthority[] toGrantedAuthorities(String... roles) {
//        return toGrantedAuthorities(roles);
//    }

    private GrantedAuthority[] toGrantedAuthorities(Set<RoleEntity> roles) {
    	GrantedAuthority[] result = new GrantedAuthority[roles.size()];
    	int  i = 0;
        for (RoleEntity role: roles){
        	result[i++] = new GrantedAuthorityImpl(role.getRole());        	
        }            
        return result;
    }
    
    public SecurityDaoJpa getSecurityDaoJpa() {
		return securityDaoJpa;
	}

	public void setSecurityDaoJpa(SecurityDaoJpa securityDaoJpa) {
		this.securityDaoJpa = securityDaoJpa;
	}    
}
