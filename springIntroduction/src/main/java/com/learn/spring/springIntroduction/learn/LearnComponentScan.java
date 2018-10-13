package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.spring.springIntroduction.scope.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.learn.spring.scope")
public class LearnComponentScan {

	private static Logger logger = LoggerFactory.getLogger(LearnComponentScan.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnComponentScan.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		// logger.info("{}", personDAO.getjDBCConnection());

	}
}
