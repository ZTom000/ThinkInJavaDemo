package com.ztom.chap8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
// Demonstrates performance differences in Maps
public class MapPerformance {
	
	private static final int REPS = 200;
	public static Map fill(Map m, int size) {
		for(int i = 0;i<size;i++) {
			String x = Integer.toString(i);
			m.put(x, x);
		}
		return m;
	}
	
	private abstract static class Tester{
		String name;
		Tester(String name){
			this.name = name;
		}
		abstract void test(Map m, int size);
	}
	
	private static Tester[] tests = {
			
	};
	
	public static void test(Map m, int size) {
		// A trick to print out the class name:
		System.out.println("Testing " + m.getClass().getName() + " size " + size);
		fill(m,size);
		for(int i = 0; i<tests.length;i++) {
			System.out.println(tests[i].name);
			long t1 = System.currentTimeMillis();
			tests[i].test(m, size);
			long t2 = System.currentTimeMillis();
			System.out.println(": " + ((double)(t2 - t1)/(double)size));
		}
	}
	public static void main(String[] args) {
		// Small
		test(new Hashtable(), 10);
		test(new HashMap(), 10);
		test(new TreeMap(), 10);
		// Medium
		test(new Hashtable(), 100);
		test(new HashMap(), 100);
		test(new TreeMap(), 100);
		// Large
		test(new Hashtable(), 1000);
		test(new HashMap(), 1000);
		test(new TreeMap(), 1000);
	}

}
