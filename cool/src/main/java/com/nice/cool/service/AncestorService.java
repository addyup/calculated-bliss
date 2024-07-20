package com.nice.cool.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class AncestorService {

	
	public List<List<Integer>> getAncestors(int n, int[][] edges) {
		

		HashMap<Integer, HashSet<Integer>> parentsToChildren = new HashMap<>();
		int[] noOfParents = new int[n];
		
		for(int[] edge: edges) {
			
			int parent = edge[0];
			int child = edge[1];
			
			if(!parentsToChildren.containsKey(parent)) {
				
				parentsToChildren.put(parent, new HashSet<>());
				
			}
			
			parentsToChildren.get(parent).add(child);
			noOfParents[child]++;
			
		}
		
		List<TreeSet<Integer>> childrenToParents = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			
			childrenToParents.add(new TreeSet<>());
			
			if(noOfParents[i] == 0) {
				
				q.offer(i);
				
			}
			
		}
		
		while(!q.isEmpty()) {
			
			int currentParent = q.remove();
			
			for(int currentChild : parentsToChildren.getOrDefault(currentParent, new HashSet<>())) {
				
				childrenToParents.get(currentChild).add(currentParent);
				childrenToParents.get(currentChild).addAll(childrenToParents.get(currentParent));
				
				noOfParents[currentChild]--;
				
				if(noOfParents[currentChild] == 0) {
					
					q.offer(currentChild);
					
				}
				
			}
			
		}
		
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			result.add(new ArrayList<>(childrenToParents.get(i)));
			
		}
		
		return result;
		
	}
	
}
