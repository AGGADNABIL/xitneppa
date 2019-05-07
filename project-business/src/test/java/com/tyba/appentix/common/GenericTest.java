/*
* GenericTest.java
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

// TODO: Auto-generated Javadoc
/**
 * The Class GenericTest.
 *
 * @author TYBASOFT
 */

@ContextConfiguration(locations = {
		"classpath:spring/applicationContext-db.xml",
		"classpath:spring/applicationContext-cache.xml",
		"classpath:spring/applicationContext-trx.xml" })
@RunWith(value = SpringJUnit4ClassRunner.class)
public abstract class GenericTest {

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
