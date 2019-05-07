/*
 * UtilsTest.java
 *
 * Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
 */

package com.tyba.appentix.business.utils;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.tyba.technicalServices.security.RoleEntity;
import com.tyba.technicalServices.security.UserEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class UtilsTest.
 * 
 * @author TYBASOFT
 */
public class UtilsTest {

	/**
	 * Serialize object to json string test.
	 */
	@Test
	public void serializeObjectToJsonStringTest() {

		String expectedJsonString = "{\"firstName\":\"first name\",\"lastName\":\"last name\",\"username\":null,\"password\":null,\"roles\":[{\"role\":\"role1\"}]}";

		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName("first name");
		userEntity.setLastName("last name");

		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRole("role1");
		Set<RoleEntity> roles = new HashSet<RoleEntity>(1);
		roles.add(roleEntity);

		userEntity.setRoles(roles);

		String result = Utils.serializeObjectToJsonString(userEntity);
		Assert.assertEquals(expectedJsonString, result);
	}
}
