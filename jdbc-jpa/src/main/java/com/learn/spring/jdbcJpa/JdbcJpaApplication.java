package com.learn.spring.jdbcJpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.spring.jdbcJpa.person.repository.PersonSpringDataJpa;

@SpringBootApplication
public class JdbcJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	PersonSpringDataJpa personSpringDataJpa;
//	@Autowired
//	PersonJpaRepository personJpaRepository;

//	@Autowired
//	PersonDaoJdbc personDaoJdbc;

	public static void main(String[] args) {
		SpringApplication.run(JdbcJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("all person are {}", personDaoJdbc.findAllPerson());
//		logger.info("person with 1001 id {}", personDaoJdbc.findById(1001));
//		logger.info("person deleted has id {}", personDaoJdbc.deleteById(1002));
		// logger.info("person deleted has id {}", personJpaRepository.findById(1002));
		// Person person = new Person("Ali", new Date());
		// logger.info("added person {}", personJpaRepository.update(person));
		// logger.info("all the person {}", personJpaRepository.findAll());
		logger.info("all the  person  {}", personSpringDataJpa.findAll());
		logger.info("person found  {}", personSpringDataJpa.findByName2("name2"));

	}
}
