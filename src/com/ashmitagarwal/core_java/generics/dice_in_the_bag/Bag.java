package com.ashmitagarwal.core_java.generics.dice_in_the_bag;

public class Bag<E> {
	
	E dice1;
	E dice2;
	
	public Bag() {}
	
	public Bag(E dice1, E dice2) {
		this.dice1 = dice1;
		this.dice2 = dice2;
	}
	
	public E getDice1() {
		return dice1;
	}
	public void setDice1(E dice1) {
		this.dice1 = dice1;
	}
	public E getDice2() {
		return dice2;
	}
	public void setDice2(E dice2) {
		this.dice2 = dice2;
	}
}
