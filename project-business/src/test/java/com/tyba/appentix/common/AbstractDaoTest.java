/*
* AbstractDaoTest.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.tyba.technicalServices.core.ClientParameters;
import com.tyba.technicalServices.core.User;
import com.tyba.technicalServices.core.UserContext;



// TODO: Auto-generated Javadoc
/**
 * The Class AbstractDaoTest: class abstraite de laquelle vont hériter les classes de test DAO.
 *
 * @version 1.0 20 nov. 2014
 * @author TYBASOFT
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
public abstract class AbstractDaoTest {

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		User user = new User("1", "CODE03");
		// preparation ds parametres
		ClientParameters clientParameters = new ClientParameters();
		clientParameters.setUser(user);
		UserContext.setClientParameters(clientParameters);
	}
}
