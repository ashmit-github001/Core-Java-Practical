package com.ashmitagarwal.core_java.generics;

import com.ashmitagarwal.core_java.generics.balls_in_the_basket.*;
import com.ashmitagarwal.core_java.generics.dice_in_the_bag.*;

public class GenericsPro2UpperBoundExample {
	
	public static void main(String[] args) {
		
		/*
		  If we consider dice in the bag example,
		  we can add any type in the Bag.
		*/
		Bag<String> bag = new Bag<>("abc", "xyz");
		
		
		/*
		   We can make use of inheritance to restrict :
		   - The type that goes inside the Basket should only be a Ball
		   - Each Basket can contain same coloured Ball
		   
		   Using : Basket<E extends Ball>
		   
		   Also, now the methods/properties of Ball class is open to use via the elements of Basket
		*/
		
		Basket<RedBall> redBasket = new Basket <>(new RedBall(), new RedBall()); // Allowed
//		Basket<String> ballBasket = new Basket <>(new RedBall(), new RedBall()); Not Allowed by the Compiler
//		Basket<BlueBall> blueBasket = new Basket <>(new BlueBall(), new RedBall()); Not Allowed by the Compiler
		
		System.out.println(redBasket.isOfSameSize());
	}

}
