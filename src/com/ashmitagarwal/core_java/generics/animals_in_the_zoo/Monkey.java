package com.ashmitagarwal.core_java.generics.animals_in_the_zoo;

public class Monkey extends Animal implements Eats, Plays {
	
	public String getType() {
		return "Monkey";
	}

	@Override
	public void eat() {
		System.out.println("Monkey eats...");
		
	}
	
	@Override
	public void play() {
		System.out.println("Monkey plays...");
	}
}
