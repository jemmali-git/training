package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.spring.springIntroduction.learn.cdi.CdiDAO;

@SpringBootApplication

public class LearnCdi {

	private static Logger logger = LoggerFactory.getLogger(LearnCdi.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnCdi.class, args);

		CdiDAO cdiDAO = applicationContext.getBean(CdiDAO.class);
		// PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{} Cdi Dao {}", cdiDAO, cdiDAO.getCdiConnection());
		// logger.info("{}", personDAO2.getjDBCConnection());
	}
}
