package com.learn.spring.jdbcJpa.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learn.spring.jdbcJpa.person.entity.Person;

public interface PersonSpringDataJpa extends JpaRepository<Person, Integer> {
	@Query("SELECT t FROM Person t WHERE t.name = ?1")
	List<Person> findByName2(String name);

	List<Person> findByName(String name);
}
