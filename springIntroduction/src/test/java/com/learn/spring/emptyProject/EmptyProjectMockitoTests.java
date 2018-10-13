package com.learn.spring.emptyProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.learn.spring.springIntroduction.learn.cdi.CdiConnection;
import com.learn.spring.springIntroduction.learn.cdi.CdiDAO;

@RunWith(MockitoJUnitRunner.class)

public class EmptyProjectMockitoTests {

	@Mock
	CdiConnection cdiConnection;

	@InjectMocks
	CdiDAO cdDao;

	@Test
	public void contextLoads() {
		Mockito.when(cdiConnection.getData()).thenReturn(new int[] { 10, 20, 30 });
		assertEquals(30, cdDao.getGreatest());
	}

}
