package com.ashmitagarwal.core_java.static_keyword;

public class TestClass2 {
	
	public static void main(String[] args) {
		
		SampleClass2 obj1 = new SampleSubClass2();
//		Default constructor of SampleSubClass2
//		staticMethod1 method of SampleClass2

		SampleClass2.staticMethod1();
//		staticMethod1 method of SampleClass2
		SampleSubClass2.staticMethod1();
//		staticMethod1 method of SampleSubClass2
		
		obj1.staticMethod1(); // Not recommended
//		staticMethod1 method of SampleClass2
		
		obj1.non_staticMethod1();
//		non_staticMethod1 method of SampleSubClass2
//		staticMethod1 method of SampleClass2
	}

}
