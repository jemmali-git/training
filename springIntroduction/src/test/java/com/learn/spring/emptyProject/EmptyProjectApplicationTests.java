package com.learn.spring.emptyProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.learn.spring.springIntroduction.learn.basics.BinarySearchImpl;

@RunWith(SpringRunner.class)
//@SpringBootTest
//@ContextConfiguration(classes = EmptyProjectBasics.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class EmptyProjectApplicationTests {

	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void contextLoads() {
		assertEquals(3, binarySearchImpl.binarySearch(new int[] {}, 3));
	}

}
