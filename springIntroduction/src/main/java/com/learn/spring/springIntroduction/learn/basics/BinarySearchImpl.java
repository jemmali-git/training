package com.learn.spring.springIntroduction.learn.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import com.learn.spring.springIntroduction.learn.LearnScope;

@Component
@EnableAutoConfiguration
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl extends LearnScope {

	@Autowired
	// @Qualifier("bubble")
	SortAlgorthim sortAlgorthim;

//	public BinarySearchImpl(SortAlgorthim sortAlgorthim) {
//		super();
//		this.sortAlgorthim = sortAlgorthim;
//	}

	public int binarySearch(int[] numbers, int numbertToSearch) {
		int[] sortedNumbers = sortAlgorthim.sort(numbers);
		System.out.println(sortAlgorthim);
		return 3;
	}

	public SortAlgorthim getSortAlgorthim() {
		return sortAlgorthim;
	}
}
