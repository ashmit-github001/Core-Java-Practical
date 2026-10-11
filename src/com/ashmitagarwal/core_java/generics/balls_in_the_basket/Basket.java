package com.ashmitagarwal.core_java.generics.balls_in_the_basket;

public class Basket<E extends Ball> {
	
	E ball1;
	E ball2;
	
	public Basket() { }
	
	public Basket(E ball1, E ball2) {
		this.ball1 = ball1;
		this.ball2 = ball2;
	}
	
	public E getBall1() {
		return ball1;
	}
	
	public void setBall1(E ball1) {
		this.ball1 = ball1;
	}
	
	public E getBall2() {
		return ball2;
	}
	
	public void setBall2(E ball2) {
		this.ball2 = ball2;
	}
	
	// The methods/properties of Ball class is open to use via the elements of Basket due to 'extends Ball'
	public boolean isOfSameSize() {	
		return ball1.getSize() == ball2.getSize();
	}
}
