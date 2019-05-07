package com.tyba.technicalServices.tools;

public class StringUtils {
	public static boolean isEmpty(String in){
		if(in == null || in.equals("")){
			return true;
		}
		return false;
	}	
}
