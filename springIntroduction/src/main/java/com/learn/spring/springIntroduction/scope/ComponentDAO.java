package com.learn.spring.springIntroduction.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	@Autowired
	private ComponentConnection componentConnection;

	public ComponentConnection getjDBCConnection() {
		return componentConnection;
	}

	public void setjDBCConnection(ComponentConnection jDBCConnection) {
		this.componentConnection = jDBCConnection;
	}

}
