package com.ashmitagarwal.core_java.generics;

import com.ashmitagarwal.core_java.generics.dice_in_the_bag.Bag;
import com.ashmitagarwal.core_java.generics.dice_in_the_bag.BlueDice;
import com.ashmitagarwal.core_java.generics.dice_in_the_bag.RedDice;
import com.ashmitagarwal.core_java.generics.dice_in_the_bag.WrongBag;

public class GenericsBasics2 {

	public static void main(String args[]) {
		
		
		// Custom Generic Types
		
		WrongBag wannabeRedBag = new WrongBag();
		wannabeRedBag.setDice1(new RedDice());
		wannabeRedBag.setDice1(new BlueDice());

		Bag<RedDice> redBag = new Bag<>();
		redBag.setDice1(new RedDice());
		redBag.setDice2(new RedDice());
//		redBag.setDice2(new BlueBall()); --> Compiler won't allow
		
		Bag<BlueDice> blueBag = new Bag<>();
		blueBag.setDice1(new BlueDice());
		blueBag.setDice2(new BlueDice());
		
		/*
		   If instead of Generic, Object was used like in WrongBag,
		   then a bag could have allowed mix colored dice, which we don't want!
		*/
		
		
		
		/* ------------------------------------------------------------ */
		
		
		
		// Generics with Constructors
		
		Bag<BlueDice> bag1 = new Bag<>(new BlueDice(), new BlueDice());
		
		Bag<BlueDice> bag2 = new Bag(new BlueDice(), new RedDice()); // How is this allowed?
		
//		Basket<BlueBall> bag3 = new Basket<BlueBall>(new BlueBall(), new RedBall()); // But this isn't ?!?
		
		
		/*
		  
		  In case of 'bag2' :
		    
		  - When the expression on the right side is evaluated , no Generic is assigned.
		  	It is just creating an Object of Basket with some objects passed to it.
		  	So, passing just 'new RedBall()' is --> Raw Type assigned to Generic Type.
		  	
		  - When the right side Object is then assigned to 'Basket<BlueBall> bag2',
		  	it is again --> Raw Type assigned to a Generic Type
		  
		  - This type of inter-operability of assigning,
		  	Raw Type to Generic Type and Generic Type to Raw Type,
		  	is supported in Java to prevent backward incompatibility.
		  	
		  - Hence, it works fine.
		  
		  
		  In case of 'bag3' :
		  
		  - The right side expression is of Generic Type,
		  	due to use of <BlueBall>, so it doesn't allow RedBall Type to be passed.
		  	And it shows - The constructor Basket<BlueBall>(BlueBall, RedBall) is undefined
		  	
		  - Also, if we use new Basket<>(new BlueBall(), new RedBall()),
		  	it will show - Cannot infer type arguments for Basket<>
		  
		*/
		
		
		
		/* ------------------------------------------------------------ */

	}
}
