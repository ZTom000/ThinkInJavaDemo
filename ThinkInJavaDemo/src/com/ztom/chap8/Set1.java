package com.ztom.chap8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Things you can do with Sets
public class Set1 {
	public static void testVisual(Set a) {
		Collection1.fill(a);
		Collection1.fill(a);
		Collection1.fill(a);
		Collection1.print(a); // No duplicates！
		// Add another set to this one:
		a.addAll(a);
		a.add("one");
		a.add("one");
		a.add("one");
		Collection1.print(a);
		// Look something up:
		System.out.println("a.contains(\"ones\")" + a.contains("one"));
		
	}
	public static void main(String[] args) {
		testVisual(new HashSet());
		testVisual(new TreeSet());
	}

}
