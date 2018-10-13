package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.learn.spring.springIntroduction.learn.propreties.SomeExternalServices;

@SpringBootApplication
@PropertySource("classpath:app.propreties")
public class LearnPropreties {

	private static Logger logger = LoggerFactory.getLogger(LearnPropreties.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnPropreties.class, args);

		SomeExternalServices someExternalServices = applicationContext.getBean(SomeExternalServices.class);
		// PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", someExternalServices.getUrl());
		// logger.info("{}", personDAO2.getjDBCConnection());
	}
}
