package com.tyba.technicalServices.core;

import java.util.HashMap;
import java.util.Map;

public class UserContext {
	private Map map = new HashMap();
	private static ThreadLocal threadLocal = new ThreadLocal(){
		@Override
        protected UserContext initialValue() {
            return new UserContext();
        }
	};
	public static UserContext get() {
        return (UserContext)threadLocal.get();
    }

	public static void setSubject(Object subject){
		get().map.put("subject", subject);
	}
	

	public static Object getSubject(){
		return get().map.get("subject");
	}
	public static void setClientParameters(ClientParameters params){
		get().map.put("params", params);
	}
	public static ClientParameters getClientParameters(){
		return (ClientParameters)get().map.get("params");
	}
	
	public static void setEm(Object subject){
		get().map.put("em", subject);
	}
	

	public static Object getEm(){
		return get().map.get("em");
	}
	
}

