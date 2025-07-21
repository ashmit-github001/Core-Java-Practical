package com.ashmitagarwal.core_java.super_keyword;

public class SampleSubClass1 extends SampleClass1 {
	
	public int i;
	
	public SampleSubClass1(){
		super();
		i = 20;
		System.out.println("Default constructor of SampleSubClass1");
		System.out.println("super.i = " + super.i);
		System.out.println("i = " + i);
	}

}
