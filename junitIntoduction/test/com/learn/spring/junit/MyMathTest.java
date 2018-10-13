package com.learn.spring.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.learn.spring.junit.MyMath;

public class MyMathTest {

	@Before
	public void before() {
		System.out.println("beefore");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beefore Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after Class");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		MyMath myMath = new MyMath();
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void test2() {
		System.out.println("test2");
		MyMath myMath = new MyMath();
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}
}
