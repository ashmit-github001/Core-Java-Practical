package com.ashmitagarwal.core_java.generics;

import com.ashmitagarwal.core_java.generics.animals_in_the_zoo.Lion;
import com.ashmitagarwal.core_java.generics.animals_in_the_zoo.Monkey;
import com.ashmitagarwal.core_java.generics.animals_in_the_zoo.StaticCage;

public class GenericsProd5TheStaticMethod {

	public static void main(String[] args) {
		
		StaticCage<Monkey> monkeyCage = new StaticCage<>(new Monkey(), new Monkey());
		System.out.println(monkeyCage.areSameAnimals()); // true
		
		/*
		 
		  If we use a static method of a Generic Type, it wouldn't allow us directly -
		  Since, the Parameter Type is associated with its elements and not the Class itself.
		  
		  And, static method is associated with the Class not its instance, so type information is not there
		  
		  So, to use the Static Method, would have to provide the type information to the Static Method itself
		  And, also use the type in the method
		 
		  Eg:
		  	public static <T extends Animal> boolean areSameAnimals(T animal1, T animal2)
			[Between static and return type]
			
		  While calling the static method, no need to explicitly mention the type
		  The Type will be infered from the types passed in.
		*/
				
		System.out.println(StaticCage.areSameAnimals(new Monkey(), new Monkey())); // true
		System.out.println(StaticCage.areSameAnimals(new Monkey(), new Lion())); // false
	}
}
