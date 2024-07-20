package com.nice.cool.service;

import org.springframework.stereotype.Service;

@Service
public class SecondHighestNumberService {
	
	public int findSecondHighest(int[] array) {
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i : array) {
			
			if (i > highest) {
				
				secondHighest = highest;
				highest = i;
				
			} else if (i > secondHighest) {
				secondHighest = i;
			}
		}
		
		return secondHighest;
	}

}
