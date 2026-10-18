package com.ashmitagarwal.core_java.generics.animals_in_the_zoo;

public class StaticCage <E extends Animal> {
	
	E animal1;
	E animal2;
	
	public StaticCage(E animal1, E animal2) {
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
	
	public static <T extends Animal> boolean areSameAnimals(T animal1, T animal2) {
		return animal1.getType().equals(animal2.getType());
	}
}
