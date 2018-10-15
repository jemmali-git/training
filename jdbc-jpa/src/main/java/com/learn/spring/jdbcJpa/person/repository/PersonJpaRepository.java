package com.learn.spring.jdbcJpa.person.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learn.spring.jdbcJpa.person.entity.Person;



@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	public Person findById(Integer id) {
		return entityManager.find(Person.class, id);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public List<Person> findAll() {
		TypedQuery<Person> typedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return typedQuery.getResultList();
	}

}
