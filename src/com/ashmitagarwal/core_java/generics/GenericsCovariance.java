package com.ashmitagarwal.core_java.generics;

import java.util.List;

public class GenericsCovariance {
	
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
		
		Number[] nArr = new Integer [2]; // Both co-variance and polymorphism
		
		Integer[] iArray = { 10, 20 };
		Number[] nArray = iArray;
		
		printsArray(iArray);
		
		nArray = returnsArray(iArray);
		
		
		
		/*
		   
		   Generic Types are Invariant to ensure type-safety.
		   So, collections does not support Covariance.
		   
		*/

		
//		ArrayList<Number> nList = new ArrayList<Integer>(); --> Not Allowed by the complier
//		Type mismatch: cannot convert from ArrayList<Integer> to ArrayList<Number>
		
		List<Integer> iList = List.of(10, 20);
//		printsList(iList); --> Not Allowed by the complier
//		The method printsList(List<Number>) is not applicable for the arguments (List<Integer>)
		
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

	private static void printsArray(Number[] nArray) {
		for(Number n : nArray) {
			System.out.println(n);
		}
		
//		nArray[0] = "abc"; --> This will be allowed by the compiler but would give - ArrayStoreException
	}
	
	private static Number[] returnsArray(Integer[] iArray) {
		return iArray;
	}
	
	private static void printsList(List<Number> nList) {
		nList.forEach(e -> System.out.println(e));
		
		/*
		   
		   Although the Type passed is Integer but I can add Double here.
		   This ignored type safety is the reason why Generic Type doesn't support 
		   covariance / inheritance / polymorphism directly
		   
		*/
		
		nList.add(3.14d);
	}
	

//	private static List<Number> returnsList(List<Integer> iList) {
	
//		return iList; // --> Not Allowed by the complier
//		Type mismatch: cannot convert from List<Integer> to List<Number>
//	}
	
	
	
	/* ------------------------------------------------------------ */
	
	
	
	/*

	  Example of Covariant Return Type in Method Overriding
	  The overriding method is returning Dog which is a SubType of Animal, this is allowed.
	  
	  So, in case :
	  
	  Example 1:
	  
	  Animal obj = new Dog();
	  Animal animal = obj.getAnimal();
	  
	  The above will still work due to covariance.
	  Because even if it returns a Dog object/ or any subtype object,
	  but it is assigned to an Animal Reference Type just fine.
	  
	  Example 2:
	  
	  Dog myDog = new Dog();
	  Dog duplicate = myDog.getAnimal(); // No Explicit Type Casting needed

	*/
	
	private class Animal {
		
		public Animal getAnimal() {
			return this;
		}
	}
	
	private class Dog extends Animal {
		
		@Override
		public Dog getAnimal() {
			return this;
		}
	}
	
}
