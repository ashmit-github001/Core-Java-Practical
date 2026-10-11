package com.ashmitagarwal.core_java.generics;

import java.util.List;

public class GenericsWildcards2 {

	public static void main(String[] args) {
		
		/*		  
		   Upper Bound Wildcard : 
		   To allow inherant types in a Generic Type, but also put some restriction on the types allowed.		   
		*/
		
		List<Integer> iList = List.of(10, 20);
		printNumber(iList);
		
		List<Double> dList = List.of(3.14 , 6.767);
		printNumber(dList);
		
		List<String> sList = List.of("abc" , "xyz");
//		printNumber(sList); --> Not Allowed by the complier
//		The method printNumber(List<? extends Number>) is not applicable for the arguments (List<String>)

	}

	private static void printNumber(List<? extends Number> list) {
		
		list.forEach(System.out::println);
		
//		list.add(new Integer()); --> Not Allowed by the complier
//		list.add(new Double()); --> Not Allowed by the complier
//		list.add(new Number()); --> Not Allowed by the complier
		
		// Compiler knows that whatever is passed is atleast a Number type
		Number num = list.get(0);
		
	}
}
