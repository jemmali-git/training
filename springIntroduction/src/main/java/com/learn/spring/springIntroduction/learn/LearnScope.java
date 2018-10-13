package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.spring.springIntroduction.learn.scope.PersonDAO;

@SpringBootApplication

public class LearnScope {

	private static Logger logger = LoggerFactory.getLogger(LearnScope.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnScope.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		// PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDAO.getjDBCConnection());
		// logger.info("{}", personDAO2.getjDBCConnection());
	}
}
