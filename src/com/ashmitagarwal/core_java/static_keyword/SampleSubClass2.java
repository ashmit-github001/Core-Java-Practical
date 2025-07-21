package com.ashmitagarwal.core_java.static_keyword;

public class SampleSubClass2 extends SampleClass2 {
	
	public SampleSubClass2(){
		System.out.println("Default constructor of SampleSubClass2");
		super.staticMethod1();
	}
	
//	Static to Static
//	@Override Not allowed - Duplication allowed
	public static void staticMethod1() {
		System.out.println("staticMethod1 method of SampleSubClass2");
//		super.staticMethod1(); // Not allowed
	}

	
//	Non-static to Non-static
//	Plain Overriding allowed 
	@Override
	public void non_staticMethod1() {
		System.out.println("non_staticMethod1 method of SampleSubClass2");
		super.staticMethod1();
	}

//	Static to Non-Static
// 	@Override Not allowed - Duplication & Hiding Not allowed
	
//	public void staticMethod2() { 
//			System.out.println("staticMethod2 method of SampleSubClass2");
//	}
	
	
//	Non-Static to Static
// 	@Override Not allowed - Duplication & Hiding Not allowed
	
//	public static void non_staticMethod2() { 
//			System.out.println("staticMethod2 method of SampleSubClass2");
//	}
}
