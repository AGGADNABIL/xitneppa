/*
* Utils.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/

package com.tyba.appentix.business.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;

// TODO: Auto-generated Javadoc
/**
 * The Class Utils.
 *
 * @version 1.0 20 nov. 2014
 * @author TYBASOFT
 */
public class Utils {
	
	/** The logger. */
	private static ILogger logger = SL4JLogger.getInstance(Utils.class);

	/**
	 * Serialize object to json string.
	 *
	 * @param sourceObject the source object
	 * @return the string
	 */
	public static String serializeObjectToJsonString(Object sourceObject) {
		String jsonString = "";
		try {
			ObjectMapper objectMapper = getObjectMapper();

			jsonString = objectMapper.writeValueAsString(sourceObject);

		} catch (JsonGenerationException | JsonMappingException e) {
			jsonString = sourceObject.toString();
			logger.error("JSON Serialization error", e);
			
		} catch (IOException e) {
			jsonString = sourceObject.toString();
			logger.error("JSON Serialization error", e);
			
		}
		return jsonString;
	}

	/**
	 * Gets the object mapper.
	 *
	 * @return the object mapper
	 */
	private static ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.setVisibilityChecker(objectMapper.getSerializationConfig()
				.getDefaultVisibilityChecker()
				.withFieldVisibility(Visibility.ANY)
				.withGetterVisibility(Visibility.NONE)
				.withSetterVisibility(Visibility.NONE)
				.withCreatorVisibility(Visibility.NONE));
		return objectMapper;
	}
}
