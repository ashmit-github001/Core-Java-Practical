package com.ashmitagarwal.core_java.generics.animals_in_the_zoo;

public class Lion extends Animal implements Eats, Plays {
	
	public String getType() {
		return "Lion";
	}

	@Override
	public void eat() {
		System.out.println("Lion eats...");
		
	}
	
	@Override
	public void play() {
		System.out.println("Lion plays...");
	}
}
