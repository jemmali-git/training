package com.learn.spring.springIntroduction.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.spring.springIntroduction.learn.basics.BinarySearchImpl;

@SpringBootApplication
public class LearnBasics {

	private static Logger logger = LoggerFactory.getLogger(LearnBasics.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearnBasics.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

		logger.info("{},{}", binarySearchImpl, binarySearchImpl.getSortAlgorthim());
		logger.info("{},{}", binarySearchImpl2, binarySearchImpl2.getSortAlgorthim());
		System.out.println("********");
		ApplicationContext applicationContext2 = SpringApplication.run(LearnBasics.class, args);

		BinarySearchImpl binarySearchImpl3 = applicationContext2.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl4 = applicationContext2.getBean(BinarySearchImpl.class);

		logger.info("{},{}", binarySearchImpl3, binarySearchImpl3.getSortAlgorthim());
		logger.info("{},{}", binarySearchImpl4, binarySearchImpl4.getSortAlgorthim());

//		int num = binarySearchImpl.binarySearch(new int[] { 1, 2 }, 2);
//		System.out.println(num);
	}
}
