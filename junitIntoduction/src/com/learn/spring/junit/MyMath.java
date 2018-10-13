package com.learn.spring.junit;

public class MyMath {

	public int sum(int[] number) {
		int sum = 0;

		for (int i : number) {
			sum += i;
		}
		return sum;
	}

}
