package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.springIntroduction.learn.scope.PersonDAO;

@Configuration
@ComponentScan
public class LearnSpringCore {

	private static Logger logger = LoggerFactory.getLogger(LearnSpringCore.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				LearnSpringCore.class)) {
			PersonDAO personDAO = annotationConfigApplicationContext.getBean(PersonDAO.class);

			// PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			logger.info("personDAO.getjDBCConnection {}", personDAO.getjDBCConnection());

			String[] beanNames = annotationConfigApplicationContext.getBeanDefinitionNames();
			for (int i = 0; i < beanNames.length; i++) {
				System.out.println(beanNames[i]);
			}
			// logger.info("{}", personDAO2.getjDBCConnection());
		}

	}
}
