package com.learn.spring.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.springaop.dao.Dao1;

@Service
public class Business1 {
	@Autowired
	Dao1 dao1;

	public String calculate() {
		return dao1.retriveData();
	}
}
