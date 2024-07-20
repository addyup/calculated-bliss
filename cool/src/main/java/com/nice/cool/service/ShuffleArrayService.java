package com.nice.cool.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ShuffleArrayService {
	
	public int[] randomizer(int[] arr) {
		
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			int randomIndexToSwap = rand.nextInt(arr.length);
			int temp = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i] = temp;
			
			
		}
		return arr;
		
	}

}
