package com.ashmitagarwal.core_java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Generics was introduced in Java 5
// Why use Generics?
// Without generics, a Type [class/interface] eg: List, will accept any 'Object' data type

public class GenericsBasics1 {
	
	 public static void main(String[] args) {
	 
		 
		 // Without Generics
		 
		 List names = new ArrayList<>();
		 names.add("Name 1");
		 names.add("Name 2");
		 names.add(12); // No Compile Time Type Check
		 
		 // Explicit Type Casting Needed
		 String name1 = (String) names.get(0);
		 String name2 = (String) names.get(1);
//		 String name3 = (String) names.get(2); --> Gives ClassCastException - No Type Safety

		 /* 
		  
		   Without generics there will be -
		   1. No Compile-Time Type Check
		   2. Explicit Type Casting will be needed
		   3. No Type Safety
		   
		 */
		 
		 
		 
		 /* ------------------------------------------------------------ */
		 
		 
		 
		 // With Generics - List<E>
		 
		 List<String> gNames = new ArrayList<>();
		 gNames.add("gName 1");
		 gNames.add("gName 2");
//		 names2.add(12); --> Compile-Time Type Check - does not allow this
		 
		 // No Explicit Type Casting Required
		 String gName1 = gNames.get(0);
		 String gName2 = gNames.get(1);
//		 Integer gNum = gNames.get(1); --> Compile-Time Type Check - Type Safety
		 
		 
		 
		 /* ------------------------------------------------------------ */
		 
		 
		 
		 // Generics doesn't work with Primitives directly
		 // Generics work only with Java Object Types
		 // Using Wrapper Class and Auto-Boxing, generics can be made to work with Primitives
		 
		 // Auto-Boxing
		 int i = 10;
		 Integer x = 10;
		 Integer y = i;
		 
		 // Un-Boxing
		 Double z = 3.14;
		 double d = z;
		 
		 System.out.println(x + ", " + y + ", " + d); // 10, 10, 3.14
		 
		 
//		 List<int> list1 = Arrays.asList(10, 20, 30); --> This will not work
		 
		 List<Integer> list1 = Arrays.asList(10, 20, 30); // Works using auto-boxing
		 
		 int first = list1.get(0); // Works using un-boxing
		 
		 
		 
		 /* ------------------------------------------------------------ */
		 
		 
		 
		 /* 
		   IMP Points :
		  
		   1. Any CLASS or INTERFACE can make use of Generics
		   
		   2. That class or interface is a - GENERIC Type or PARAMETERIZED Type
		  
		   3. Parametrized Type because - all the Variables & Methods in that,
		   will make use of the passed Parameter (E) to denote the 
		   variable type, method parameter type, return type.
		   
		   Ex:
		   	List<E> has :
		   		-> boolean add(E e)
		   		-> Iterator<E> iterator();
		   		   Note : Return type Iterator<E> is a Generic Type in itself,
		   		   but with the same Type carried forward as passed to List
		  		   
		 */
		 
		 List<String> list2 = new ArrayList<>();
		 list2.add("foo");
		 list2.add("bar");
		 Iterator<String> itr = list2.iterator();
		 
		 
		 
		 /* ------------------------------------------------------------ */
		 
		 
		 
		 /*
		  
		   Generics Internals:
		   
		   - Generics is actually a feature of the Compiler not Run-Time
		   
		   - It is the Compiler which replaces all the occurences of the Generics
		     inside a Generic Type with the actual passed type at the Compile-time itself
		     
		   - This property of the Compiler is referred to as TYPE ERASURE
		   
		   - The Type passed is actually associated with the Variables/Expressions,
		     and not the actual Object or Reference
		     
		   - The above point can be seen as - If the 'variable' which is a Generic Type,
		     is passed to some other variable which isn't a Generic Type,
		     then it might loose its type safety
 
		 */
		 
		 List<String> namesList = new ArrayList<>();
		 
		 addNames(namesList, "Name1");
		 addNames(namesList, "Name2");
		 
		 System.out.println(namesList); // [ Name1 , Name2 ]
		 
		 incorrectAddNames(namesList, 1234);
		 
		 System.out.println(namesList); // [ Name1 , Name2 , 1234 ]
		 
		 /*
		   When I pass the Generic Type to a non-parameterized type, it loses its type safety.
		   
		   Compiler will allow passing to a raw type,
		   since compiler is designed to be backward compatible :
		    => List list = namesList; --> will be perfectly acceptable
		   
		   When calling incorrectAddNames(namesList, 1234), since I passed namesList to a
		   non-parameterized type, so now it is adding 1234 successfully.
		   
		   Because within the method compiler was adding string to a list of Object
		   
		   This signifies that the passed type is only associated with that particular Variable 
		   which is a generic type and not the actual instance or Object
		 */
		 
		 
		 
		 // But here since namesList is associated with only String type
		 
//		 String name = namesList.get(2); --> so we will get a ClassCastException at run-time
		 
		 
		 
		 /* ------------------------------------------------------------ */
		 
		 
		 
		/* 
		  Generic Lists vs Typed Arrays
		*/
		
		String[] namesArray = new String[3];
		addNamestoArray(namesArray, 0, "Name1");
		addNamestoArray(namesArray, 1, "Name2");
		
		printArray(namesArray); // [ Name1 , Name2 , null]
		
//		incorrectAddNamestoArray(namesArray, 2, 1234); ArrayStoreException
		
		/* 
		  It is not allowing to add the Integer
		  even though the array was passed to an Object Array.
		  
		  So, the Type information in an array exists in Run-time
		  even if it is passed to another Array Type which is raw unlike Generic Collections/Classes
		  
		  But these things come in picture only when assigning to a raw type.
		  In general, generics are powerful and provide a lot of Type Safety.
		*/
			
			
			
		/* ------------------------------------------------------------ */
		
		
	 }
	 
	 private static void addNames(List<String> list, String s) {
		 list.add(s);
	 }
	 
	 private static void incorrectAddNames(List list, Integer i) {
		 list.add(i);
	 }
	 
	 private static void addNamestoArray(String[] array, int i, String str) {
			array[i] = str;
			
	 }

	private static void incorrectAddNamestoArray(Object[] array, int i, int num) {
		array[i] = num;
		
	}
		
	private static void printArray(String[] array) {
		for(String s : array) {
			System.out.println(s);
		}
	}
}
