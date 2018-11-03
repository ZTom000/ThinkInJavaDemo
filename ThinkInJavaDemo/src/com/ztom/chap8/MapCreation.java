package com.ztom.chap8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

// Demonstrates time differences in Map creation
public class MapCreation {

	public static void main(String[] args) {
		final long REPS = 100000;
		long t1 = System.currentTimeMillis();
		System.out.println("Hashtable");
		for (long i = 0; i < REPS; i++) {
			new Hashtable();
		}
		long t2 = System.currentTimeMillis();
		System.out.println(": " + (t2 - t1));
		t1 = System.currentTimeMillis();
		System.out.println("TreeMap");
		for (long i = 0; i < REPS; i++) {
			new TreeMap();
		}
		t2 = System.currentTimeMillis();
		System.out.println(": " + (t2 - t1));
		t1 = System.currentTimeMillis();
		System.out.println("HashMap");
		for (long i = 0; i < REPS; i++) {
			new HashMap();
		}
		t2 = System.currentTimeMillis();
		System.out.println(": " + (t2 - t1));
	}

}
