package com.nice.cool.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class SameElementService {

	public Boolean sameElements(List<Integer> l1, List<Integer> l2) {
		
//		Set<Integer> uniqueElements1 = new HashSet<>(l1);
//		Set<Integer> uniqueElements2 = new HashSet<>(l2);
//		
//		if(uniqueElements1.size() != uniqueElements2.size()) return false;
//		
//		for(Integer integer: uniqueElements1) {
//			if(!uniqueElements2.contains(integer)) return false;
//		}
		return true;
	}
}
