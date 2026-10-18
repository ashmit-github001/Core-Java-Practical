package com.ashmitagarwal.core_java.generics;

import java.util.List;

public class GenericsPro1Wildcards {

	public static void main(String[] args) {
		
		/* 
		   
		   ? : It is a wildcard. Implies that there is some Type but it is Unknown
		   
		   Although, we give up the ability to add something to the generic list when using ?
		   
		*/
		
		List<String> sList = List.of("abc", "xyz");
		printList(sList); // abc xyz 
		
		List<Integer> iList = List.of(10, 20);
		printList(iList); // 10 20 
		
		
		
		// Works this way also
		
		List<?> list = iList;
		list = sList;
		Object o = list.get(0);
//		list.add(new String()); --> Not Allowed by the complier
		
		
		/*
		  		   
		   How can Generic Types use Inheritance / Polymorphism / Covariance
		   
		   Ans : Using Upper Bound Wildcard
		   
		   To allow inherant types in a Generic Type, but also put some restriction on the types allowed.
		   
		*/
		
		List<Integer> intList = List.of(10, 20);
		printNumber(intList);
		
		List<Double> doubList = List.of(3.14 , 6.767);
		printNumber(doubList);
		
		List<String> strList = List.of("abc" , "xyz");
//		printNumber(sList); --> Not Allowed by the complier
//		The method printNumber(List<? extends Number>) is not applicable for the arguments (List<String>)
		
	}

	private static void printList(List<?> list) {
		
		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
//		list.add(new String()); --> Not Allowed by the complier
//		list.add(new Integer()); --> Not Allowed by the complier
//		list.add(new Object()); --> Not Allowed by the complier
		
		Object o = list.get(0);
		
		/*
		  
		   - So, compiler does a compile-time type check
		     wherever this function using wildcard (any type) is being called.
		   
		   - However, compiler doesn't allow adding anything into the list since the type isn't fixed.	   
		   
		*/
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
