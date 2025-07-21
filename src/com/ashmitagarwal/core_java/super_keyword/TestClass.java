package com.ashmitagarwal.core_java.super_keyword;

public class TestClass {
	
	public static void main(String[] args) {
		
		SampleClass1 obj1 = new SampleClass1();
//		Default constructor of SampleClass1 
//		i = 10
		SampleSubClass1 obj2 = new SampleSubClass1();
//		Default constructor of SampleClass1
//		i = 10
//		Default constructor of SampleSubClass1
//		super.i = 10
//		i = 20
		SampleClass1 obj3 = new SampleSubClass1();
//		Default constructor of SampleClass1
//		i = 10
//		Default constructor of SampleSubClass1
//		super.i = 10
//		i = 20

		System.out.println("SampleClass1.i = " + obj1.i); // 10
		System.out.println("SampleSubClass1.i = " + obj2.i); // 20				
		System.out.println("SampleClass1.SampleSubClass1.i = " + obj3.i); // 10
		
		
	}

}
