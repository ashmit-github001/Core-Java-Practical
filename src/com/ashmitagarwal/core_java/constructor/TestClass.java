package com.ashmitagarwal.core_java.constructor;

public class TestClass {
	
	public static void main(String[] args) {
		
		SampleClass1 obj1 = SampleClass1.createSelfObject();
		SampleClass1 obj2 = SampleClass1.createSelfObject();
		
		System.out.println(obj1.hashCode()); // 212628335
		System.out.println(obj2.hashCode()); // 1579572132	
	}

}
