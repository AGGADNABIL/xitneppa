package com.tyba.technicalServices.web;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tyba.technicalServices.spring.BeansLookuper;

public class ApplicationContextListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext context = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext(); 
		ApplicationContext appctx = WebApplicationContextUtils.getRequiredWebApplicationContext (context); 
  		BeansLookuper.setApplicationContext(appctx);

	}
}
