package com.ashmitagarwal.core_java.generics;

import java.util.List;

public class GenericsInheritance {
	
	public static void main(String[] args) {
		
		
		/* Covariance in Java vs Polymorphism in Java */
		
		// Simple Polymorphism Examples
		
		Object o = new String("abc");
		
		String s1 = new String("abc");
		prints(s1);
		
		String s2 = new String("abc");
		Object o2 = returns (s2);
		
		
		
		/* 
		 
		   In Covariance - A SubType can be used where a SuperType was expected,
		   in certain contexts other than simple object-reference assignment.
		   
		   It is applicable in scenarios like -
		    - Arrays
		    - Covariant Return Type in Method Overriding
		    - Generic Types [using Wildcards]	    
		    
		*/
		
		
		
		// Arrays Support Co-variance directly
		
		Object[] objArr = new String [2]; // Both co-variance and polymorphism
		
		String[] sArray = { "foo", "bar" };
		Object[] oArray = sArray;
		
		printsArray(sArray);
		
		oArray = returnsArray(sArray);
		
		
		
		// Generic Types are Invariant. So, collections does not support Covariance

		
//		List<Object> objList = new ArrayList<String>();
//		Type mismatch: cannot convert from List<String> to List<Object>
		
		List<String> sList = List.of("foo", "bar");
//		printsList(sList); 
//		The method printsList(List<Object>) is not applicable for the arguments (List<String>)
		
		
		
		/*
		   So, how do we make use of Inheritance in case of Generic Types?
		   Answer : Using WILDCARDS !!
		*/
		
	}

	private static void prints(Object o) {
		System.out.println(o);
	}
	
	private static Object returns(String s) {
		return s;
	}

	private static void printsArray(Object[] oArray) {
		for(Object o : oArray) {
			System.out.println(o);
		}
	}
	
	private static Object[] returnsArray(String[] sArray) {
		return sArray;
	}
	
	private static void printsList(List<Object> oList) {
		oList.forEach(e -> System.out.println(e));
	}
	
	// Not Allowed
//	private static List<Object> returnsList(List<String> sList) {
//		return sList; --> Type mismatch: cannot convert from List<String> to List<Object>
//	}
	
}
