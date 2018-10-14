package com.learn.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@org.aspectj.lang.annotation.Aspect
@Configuration
public class Aspect {

	// AfetrReturning
	// Around
	// After
	// Before
	// PointCut in a separate file
	// TrackTime "Custom annotation"
	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
	@Before("execution(* com.learn.spring.springaop.dao.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("check User Access {}", joinPoint);
	}

	@After("execution(* com.learn.spring.springaop.dao.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("close User Access {}", joinPoint);
	}

}
