package com.ashmitagarwal.core_java.generics.animals_in_the_zoo;

public class Cage <E extends Animal & Eats & Plays> {

	E animal1;
	E animal2;
	
	public Cage(E animal1, E animal2) {
		super();
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
	
	public E getAnimal1() {
		return animal1;
	}
	public void setAnimal1(E animal1) {
		this.animal1 = animal1;
	}
	public E getAnimal2() {
		return animal2;
	}
	public void setAnimal2(E animal2) {
		this.animal2 = animal2;
	}
	
	public boolean areSameAnimals() {
		return animal1.getType().equals(animal2.getType());
	}
	
	public void feedAnimals() {
		animal1.eat();
		animal2.eat();
	}
	
	public void playWithAnimals() {
		animal1.play();
		animal2.play();
	}
}
