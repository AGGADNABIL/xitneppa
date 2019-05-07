/*
* AbstractUCTest.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.common;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tyba.technicalServices.core.ClientParameters;
import com.tyba.technicalServices.core.User;
import com.tyba.technicalServices.core.UserContext;



/**
 * The Class AbstractUCTest.
 *
 * @version 1.0 20 nov. 2014
 * @author TYBASOFT
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public abstract class AbstractUCTest {

	/** The client parameters. */
	protected ClientParameters clientParameters = new ClientParameters();

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		User user = new User("1", "CODE03");
		// preparation ds parametres
		clientParameters.setUser(user);
		UserContext.setClientParameters(clientParameters);
	}
}
