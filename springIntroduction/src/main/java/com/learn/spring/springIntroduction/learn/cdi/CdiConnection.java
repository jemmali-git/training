package com.learn.spring.springIntroduction.learn.cdi;

import javax.inject.Named;

@Named
public class CdiConnection {

	public int[] getData() {

		return new int[] { 1, 2, 3 };
	}

}
