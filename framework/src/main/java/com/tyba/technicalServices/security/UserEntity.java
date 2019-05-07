package com.tyba.technicalServices.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;


@Entity
@Table(name="USER_ENTITY")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "USER_ENTITY_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)
public class UserEntity extends GenericEntity implements ITracable{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "id")
	private Long id;
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
    private String profil;
    private String population;
    private String matr;
    private String statut;
   
	private String username;
	private String password;
	@OneToMany(fetch= FetchType.EAGER) 
    @JoinTable(
        name="authorities",
        joinColumns = @JoinColumn( name="id"),
        inverseJoinColumns = @JoinColumn( name="authority")
    )
    private Set<RoleEntity> roles;
	
	public void setMatr(String matr) {
		this.matr = matr;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public String getMatr() {
		return matr;
	}

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}