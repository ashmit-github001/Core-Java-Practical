package com.ashmitagarwal.core_java.constructor;

public class SampleClass1 {
	
	private SampleClass1() {
		System.out.println("No one can reach me from outside.");
	}
	
	public static SampleClass1 createSelfObject() {
		
		return new SampleClass1();
	}

}
