package com.core.java.collections.unmodifiable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableDemo {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>();
		
		a.add("1");
		a.add("2");
		a.add("3");
		
		List<String> unmodifiableList1 = Collections.unmodifiableList(new ArrayList<>(a));
		List<String> unmodifiableList2 = Collections.unmodifiableList(a);
		
		a.add("4");
		
		System.out.println(unmodifiableList1);
		System.out.println(unmodifiableList2);
		unmodifiableList2.add("5");
		
	}

}
