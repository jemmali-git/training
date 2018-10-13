package com.learn.spring.mockito;

public class SomeBusiness {

	DataDao dataDao;

//	public SomeBusiness(DataDao dataDao) {
//		this.dataDao = dataDao;
//	}

	public int getMax() {
		int[] numbers = dataDao.getNumbers();
		int min = Integer.MIN_VALUE;
		for (int i : numbers) {
			if (i > min) {
				min = i;
			}
		}
		return min;
	}
}
