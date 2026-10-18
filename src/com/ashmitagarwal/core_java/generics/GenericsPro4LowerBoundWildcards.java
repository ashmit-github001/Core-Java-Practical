package com.ashmitagarwal.core_java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPro4LowerBoundWildcards {

	public static void main(String[] args) {
		
		/* 
		   When we use Upper Bound Wildcards -
		   
		   - Eg: List<? extends Number> means :
		     Anything which extends a Number will go into the list
		   
		   - So, we can only get an element from the Generic Type
		     but the compiler doesn't allow to add any Integer/Double/Float/Number to it,
		     since the actual type isn't known.
		     
		*/
		
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(20);
//		addToListUpper(integers0, 30); // Won't work
		printList(integers);
		
		List<Double> doubles = new ArrayList<>();
		doubles.add(3.14);
		doubles.add(6.767);
//		addToListUpper(doubles0, 1.444); // Won't work
		printList(doubles);
		
		/* 
		   When we use Lower Bound Wildcards -
		   
		   - Eg: List<? super Number> means :
		     Atleast a Number or anything which Number extends till Object will go into the lust
		   
		   - Since, we are certain of the Number Type, hence we can add Number Type using Lower Bound
		     
		*/
		
		List<Number> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(200);
//		addToListUpper(numbers, 300); // Won't work
		addToListLower(numbers, 300);
		printList(numbers);
		
//		addToListLower(integers, 300); // Can't call method like this
//		addToListLower(doubles, 1.444); // Can't call method like this
		
	}
	
	private static void addToListUpper(List<? extends Number> list, Number n) {
		
//		list.add(n); //--> Not Allowed by the complier
		
		// Compiler knows that whatever is passed is atleast a Number type
		Number num = list.get(0);
		
	}
	
	private static void addToListLower(List<? super Number> list, Number n) {
		
		// Compiler will allow adding Number
		list.add(n);
		list.add(400); // Will convert it to Number
		list.add(1.444); // Will convert it to Number
		
		// Compiler only knows that whatever is passed is atleast Object
		Object num1 = list.get(0);
		Number num2 = (Number) list.get(0);
		
	}

	private static void printList(List<? extends Number> list) {
		
		list.forEach(System.out::println);
		
		// Compiler knows that whatever is passed is atmost a Number type
		Number num = list.get(0);
		
	}
	
	/*
	  PECS -> Producer Extends Consumer Super
	  
	  If Generic is producing something (supports get) - Use Extends
	  If Generic is consuming something (supports add) - Use Super
	  
	*/
}
