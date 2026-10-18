package com.ashmitagarwal.core_java.generics;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GenericsBasics3MultipleParamTypes {
	
	public static void main(String args[]) {
		
		/* Generic Type which required more than one Parameteried Type */
		
		Map map0 = new HashMap(); // Both key and value will be of Object types, so no type-safety
		map0.put("abc", new Date());
		map0.put(new Date(), "abc");
		
		Map<String, Date> map1 = new HashMap();
		map1.put("abc", new Date());
//		map1.put(new Date(), "abc"); // --> Not allowed by the Compiler

	}

}
