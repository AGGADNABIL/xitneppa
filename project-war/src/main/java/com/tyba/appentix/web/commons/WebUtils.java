/*
* WebUtils.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.web.commons;

// TODO: Auto-generated Javadoc
/**
 * The Class WebUtils.
 *
 * @author A.EL HACHIMI ALAOUI
 */
public class WebUtils {

	/**
	 * Prepare for like statement.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String prepareForLikeStatement(String str) {
		return str != null ? "%" + str + "%" : str;
	}
}
