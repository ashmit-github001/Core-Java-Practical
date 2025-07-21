package com.ashmitagarwal.core_java.static_keyword;

public class TestClass {
	
	public static void main(String[] args) {
		
		SampleClass1 obj1 = new SampleSubClass1();	
//		Default constructor of SampleClass1
//		i = 10
//		Default constructor of SampleSubClass1
//		super.i = 10
//		SampleClass1.i = 10
//		i = 20
		
		System.out.println("SampleClass1.i = " + SampleClass1.i);
		System.out.println("SampleSubClass1.i = " + SampleSubClass1.i);
		System.out.println("obj1.i = " + obj1.i); // Not recommended
//		SampleClass1.i = 10
//		SampleSubClass1.i = 20
//		obj1.i = 10
	}

}
