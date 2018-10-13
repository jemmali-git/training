package com.learn.spring.springIntroduction.learn.basics;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubble")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BubbleSortAlgorithm implements SortAlgorthim {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
