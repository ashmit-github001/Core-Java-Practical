package com.ashmitagarwal.core_java.super_keyword;

public class SampleSubClass2 extends SampleClass2 {
	
	public int i;
	
	public SampleSubClass2(){
		super();
		i = 20;
		System.out.println("Default constructor of SampleSubClass2");
		System.out.println("super.i = " + super.i);
		System.out.println("i = " + i);
	}

}
