package com.ztom.chap8;

import java.util.Enumeration;
import java.util.Vector;

//Simple collection with Enumeration

class Cat2 {
	private int catNumber;

	Cat2(int i) {
		catNumber = i;
	}

	void print() {
		System.out.println("Cat number " + catNumber);
	}
}

class Dog2 {
	private int dogNumber;

	Dog2(int i) {
		dogNumber = i;
	}

	void print() {
		System.out.println("Dog number " + dogNumber);
	}
}

public class CatsAndDogs2 {

	public static void main(String[] args) {
		Vector cats = new Vector();
		for (int i = 0; i < 7; i++) {
			cats.addElement(new Cat2(i));
			// Not a problem to add a dog to cat2:
			cats.addElement(new Dog2(i));
		}
		Enumeration e = cats.elements();
		while (e.hasMoreElements()) {
			((Cat2) e.nextElement()).print();
			// Dog is detected only at run-time
		}
	}

}
