package com.learn.spring.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class MockitoTest {
	@Mock
	DataDao dataDao;

	@InjectMocks
	SomeBusiness someBusiness;
	
	@Test
	public void test() {
		
		when(dataDao.getNumbers()).thenReturn(new int[] { 1, 23, 4 });

		assertEquals(23, someBusiness.getMax());

	}

}
