package com.ashmitagarwal.core_java.generics;

import java.util.List;

public class GenericsWildcards1 {

	public static void main(String[] args) {
		
		/* 
		   
		   - How can Generic Types use Inheritance / Polymorphism / Covariance
		     Ans : Using Wildcard - ?
		   
		   - ? : Implies that there is some Type but it is Unknown
		   
		   - Although, we give up the ability to add something to the generic list when using ?
		   
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
}
