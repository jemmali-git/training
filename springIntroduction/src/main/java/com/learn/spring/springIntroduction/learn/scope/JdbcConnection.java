package com.learn.spring.springIntroduction.learn.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

	public JdbcConnection() {
		System.out.println("Construct " + JdbcConnection.this);
	}

	@PostConstruct
	public void informStart() {
		System.out.println("informStart @PostConstruct " + JdbcConnection.this);
	}

	@PreDestroy
	public void informeEnd() {
		System.out.println("informeEnd @PostConstruct " + JdbcConnection.this);
	}
}
