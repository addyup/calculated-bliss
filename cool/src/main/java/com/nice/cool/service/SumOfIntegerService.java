package com.nice.cool.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SumOfIntegerService {

	public Integer sumOfIntegers(List<Integer> sumList) {
		
		Integer sum = 0;
		
		for(Integer i : sumList) sum +=i;
		
		return sum;
	}
	
}
