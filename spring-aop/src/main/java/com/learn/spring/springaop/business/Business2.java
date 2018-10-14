package com.learn.spring.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.springaop.dao.Dao2;

@Service
public class Business2 {

	@Autowired
	Dao2 dao2;

	public String calculate() {
		return dao2.retriveData();
	}
}
