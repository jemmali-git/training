package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.springIntroduction.learn.xml.XmlDAO;


public class LearnXmlContext {

	private static Logger logger = LoggerFactory.getLogger(LearnXmlContext.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlDAO xmlDAO = classPathXmlApplicationContext.getBean(XmlDAO.class);


			logger.info("*****", xmlDAO.getXmlConnection());

			String[] beanNames = classPathXmlApplicationContext.getBeanDefinitionNames();
			for (int i = 0; i < beanNames.length; i++) {
				System.out.println("***** " + beanNames[i]);
			}
		}

	}
}
