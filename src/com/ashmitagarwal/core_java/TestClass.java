package com.ashmitagarwal.core_java;

import com.ashmitagarwal.core_java.constructor.SampleClass1;
import com.ashmitagarwal.core_java.super_keyword.SampleClass2;
import com.ashmitagarwal.core_java.super_keyword.SampleSubClass2;

public class TestClass {
	
	public static void main(String[] args) {
		
		SampleClass1 obj1 = SampleClass1.createSelfObject();
		SampleClass1 obj2 = SampleClass1.createSelfObject();
		
		System.out.println(obj1.hashCode()); // 212628335
		System.out.println(obj2.hashCode()); // 1579572132
		
		SampleClass2 obj3 = new SampleClass2();
//		Default constructor of SampleClass2 
//		i = 10
		SampleSubClass2 obj4 = new SampleSubClass2();
//		Default constructor of SampleClass2
//		i = 10
//		Default constructor of SampleSubClass2
//		super.i = 10
//		i = 20
		SampleClass2 obj5 = new SampleSubClass2();
//		Default constructor of SampleClass2
//		i = 10
//		Default constructor of SampleSubClass2
//		super.i = 10
//		i = 20

		System.out.println("SampleClass2.i = " + obj3.i); // 10
		System.out.println("SampleSubClass2.i = " + obj4.i); // 20				
		System.out.println("SampleClass2.SampleSubClass2.i = " + obj5.i); // 10
		
		
	}

}
