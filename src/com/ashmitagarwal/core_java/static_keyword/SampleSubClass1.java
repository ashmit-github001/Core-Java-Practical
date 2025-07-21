package com.ashmitagarwal.core_java.static_keyword;

public class SampleSubClass1 extends SampleClass1 {
	
	public static int i;
	
	public SampleSubClass1(){
		i = 20;
		System.out.println("Default constructor of SampleSubClass1");
		System.out.println("super.i = " + super.i); // Not recommended
		System.out.println("SampleClass1.i = " + SampleClass1.i);
		System.out.println("i = " + i);
	}


}
