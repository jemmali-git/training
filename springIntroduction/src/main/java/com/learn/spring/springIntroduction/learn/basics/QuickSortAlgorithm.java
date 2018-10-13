package com.learn.spring.springIntroduction.learn.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorthim {
	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
