package com.tyba.technicalServices.webservices;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
/**
 * client CXF
 * @author TYBASOFT
 *
 * @param <T>
 */
public class CXFClient  {

	private Class clazz;
	private String adresse;

	public CXFClient(Class clazz , String adresse) {
		this.clazz = clazz;
		this.adresse = adresse;
	}

	public Object getClientStub() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress(adresse);
		factory.setServiceClass(clazz);
		return factory.create();
	}
}