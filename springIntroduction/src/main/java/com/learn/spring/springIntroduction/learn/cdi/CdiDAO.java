package com.learn.spring.springIntroduction.learn.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiDAO {

	@Inject
	private CdiConnection cdiConnection;

	public CdiConnection getCdiConnection() {
		return cdiConnection;
	}

	public void setCdiConnection(CdiConnection jDBCConnection) {
		this.cdiConnection = jDBCConnection;
	}

	public int getGreatest() {
		int[] data = cdiConnection.getData();
		int max = Integer.MIN_VALUE;
		for (int i : data) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
