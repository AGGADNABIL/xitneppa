package com.tyba.technicalServices.log.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tyba.technicalServices.log.ILogger;

public class SL4JLogger implements ILogger {

	private Logger sl4jLogger;

	private SL4JLogger(Logger sl4jLogger) {
		this.sl4jLogger = sl4jLogger;
	}

	public static ILogger getInstance(Class clazz) {
		return new SL4JLogger(LoggerFactory.getLogger(clazz));
	}

	public void debug(String msg) {
		sl4jLogger.debug(msg);
	}

	public void debug(String msg, Throwable t) {
		sl4jLogger.debug(msg, t);
	}

	public void info(String msg) {
		sl4jLogger.info(msg);
	}

	public void info(String msg, Throwable t) {
		sl4jLogger.info(msg, t);

	}

	public void warning(String msg) {
		sl4jLogger.warn(msg);

	}

	public void warning(String msg, Throwable t) {
		sl4jLogger.warn(msg);

	}

	public void error(String msg) {
		sl4jLogger.error(msg);

	}

	public void error(String msg, Throwable t) {
		sl4jLogger.error(msg, t);

	}

	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean iswarnEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
