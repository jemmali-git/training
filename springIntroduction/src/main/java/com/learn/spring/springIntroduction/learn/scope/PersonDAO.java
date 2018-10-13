package com.learn.spring.springIntroduction.learn.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	private JdbcConnection jdbcConnection;

	public PersonDAO() {
		System.out.println("Construct " + PersonDAO.this);
	}

	public JdbcConnection getjDBCConnection() {
		return jdbcConnection;
	}

	public void setjDBCConnection(JdbcConnection jDBCConnection) {
		this.jdbcConnection = jDBCConnection;
	}

	@PostConstruct
	public void informStart() {
		System.out.println("@PostConstruct " + PersonDAO.this);
	}

	@PreDestroy
	public void informEnd() {
		System.out.println("informEnd @PostConstruct " + PersonDAO.this);
	}
}
