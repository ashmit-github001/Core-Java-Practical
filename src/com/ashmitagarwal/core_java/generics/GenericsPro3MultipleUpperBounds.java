package com.ashmitagarwal.core_java.generics;

import com.ashmitagarwal.core_java.generics.animals_in_the_zoo.Cage;
import com.ashmitagarwal.core_java.generics.animals_in_the_zoo.Monkey;

public class GenericsPro3MultipleUpperBounds {

	public static void main(String[] args) {
		
		/*
		  
		  - A Generic Type's Parameter Type can have multiple Upper Bounds
		  
		  - It can be a Sub-type of a Class or implement Interfaces or Both
		  
		*/
		
		Cage<Monkey> monkeyCage = new Cage<>(new Monkey(), new Monkey());
		
		/*
		 
		  - The Upper Bounds also help to determine what methods/properties the elements can access
		  
		  - Eg : animal of unknown type E is able to access methods -
		      - getType() because - E extends Animal
		      - eat() because - E extends Eats
		      - play() because - E extends Plays
		      
		  - Actual class implement interfaces but Generics use extends for both Classes and Interfaces
		  
		  - WRONG WAY : Cage <E extends Animal, Eats, Plays>
		  	Because this will act as Multiple Params like Map
		  	
		  - CORRECT WAY : Cage <E extends Animal & Eats & Plays>
		  
		  - In multiple upper bounds, if there is a Class, the Class Name has to come before the Interface Names
		    WRONG : Cage <E extends Eats & Animal & Plays>
		  
		*/
	}
}
