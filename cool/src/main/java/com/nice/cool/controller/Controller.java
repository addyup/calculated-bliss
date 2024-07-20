package com.nice.cool.controller;



import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nice.cool.model.Ancestors;
import com.nice.cool.model.Elements;
import com.nice.cool.model.FileText;
import com.nice.cool.model.Integers;
import com.nice.cool.model.RandomArray;
import com.nice.cool.model.SecondHighest;
import com.nice.cool.model.Sorter;
import com.nice.cool.model.UrlToScrape;
import com.nice.cool.service.AncestorService;
import com.nice.cool.service.FindTextInFileService;
import com.nice.cool.service.MergeSortService;
import com.nice.cool.service.SameElementService;
import com.nice.cool.service.ScraperService;
import com.nice.cool.service.SecondHighestNumberService;
import com.nice.cool.service.ShuffleArrayService;
import com.nice.cool.service.SumOfIntegerService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
	
	@Autowired
	private SameElementService sameElementService;
	
	@Autowired
	private SumOfIntegerService sumOfIntegerService;
	
	@Autowired
	private SecondHighestNumberService secondHighestNumberService;
	
	@Autowired
	private ShuffleArrayService shuffleArrayService;
	
	@Autowired
	private MergeSortService mergeSortService;
	
	@Autowired
	private FindTextInFileService findTextInFileService;
	
	@Autowired
	private ScraperService scrapeService;
	
	@Autowired
	private AncestorService ancestorService;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/returnParagraphs") 
	public String returnParagraphs_fromWebpage(){
		return scrapeService.printParagraphs();
		
	}
	
	//not done
	@PostMapping("/sameElements")
	public Boolean sameElement(@RequestBody Elements el) {
		return sameElementService.sameElements(el.getL1(), el.getL2());
		
		}
	
	@PostMapping("/sumElements")
	public Integer sumElements(@RequestBody  Integers sumList) {
		
		return sumOfIntegerService.sumOfIntegers(sumList.getIntegers());
	}
	
	@PostMapping("/secondHighest")
	public int secondHighestNumber(@RequestBody SecondHighest sh) {
		
		return secondHighestNumberService.findSecondHighest(sh.getSecondHighest());
	}
	
	@PostMapping("/randomizer")
	public int[] ramdomizer(@RequestBody RandomArray arr) {
		
		return shuffleArrayService.randomizer(arr.getRandomize());
	}
	
	@PostMapping("/getAncestor")
	public List<List<Integer>> getAncestor(@RequestBody Ancestors ancestors) {
		
		
		return ancestorService.getAncestors(ancestors.getN(), ancestors.getEdges());
//		return ancestorService.getAncestors(n, ancestors.getEdges());
		
	}
	
	@PostMapping("/mergeSort")
	public String ramdomizer(@RequestBody Sorter arrayToMerge) {
		
		System.out.println(arrayToMerge.getArray());
		java.util.regex.Matcher matcher = Pattern.compile("\\d+").matcher(arrayToMerge.getArray());
		
		List<Integer> numbers = new ArrayList<>();
		while (matcher.find()) {
		    numbers.add(Integer.valueOf(matcher.group()));
		}
		int size = numbers.size();
		int[] arrayToSort = new int[size];
		Integer[] temp = numbers.toArray(new Integer[size]);
		for (int n = 0; n < size; ++n) {
			arrayToSort[n] = temp[n];
		}
		
		
//		return mergeSortService.mergeSort(arrayToSort);
		return Arrays.toString(mergeSortService.mergeSort(arrayToSort));
	}
	
	//string not being parsed for some reason
	@PostMapping("/findStrInText")
	public boolean findTextInFile(FileText fileText) throws FileNotFoundException {
		return findTextInFileService.findStringInFile(fileText.getFilePath(), fileText.getStr());
		
	}

}
