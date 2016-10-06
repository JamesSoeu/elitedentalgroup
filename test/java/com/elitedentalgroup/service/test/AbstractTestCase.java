package com.elitedentalgroup.service.test;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( value = "/testcontext-root.xml" )
public class AbstractTestCase {
	Logger logger = LoggerFactory.getLogger(AbstractTestCase.class);
	
	/*@BeforeClass
	public static void initialize() {
		System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.xbean.spring.jndi.SpringInitialContextFactory");
		System.setProperty("lifeon.home", "D:\\work\\LifeOn1\\lifeon.home");
		try {
			new InitialContext();
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		
		BasicConfigurator.configure();
	}*/
	
	@Test
	public void test() {
		logger.debug("Test running...");
	}
}
