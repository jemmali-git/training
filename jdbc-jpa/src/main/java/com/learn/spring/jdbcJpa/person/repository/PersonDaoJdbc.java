package com.learn.spring.jdbcJpa.person.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.spring.jdbcJpa.person.entity.Person;



@Repository
public class PersonDaoJdbc {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Person> findAllPerson() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(Integer id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(Integer id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
	}

}
