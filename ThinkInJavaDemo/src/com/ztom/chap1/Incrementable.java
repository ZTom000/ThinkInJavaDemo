package com.ztom.chap1;

public class Incrementable {
	public static void incrementable(StaticTest st) {
		st.st++;
	}
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		incrementable(st1);
		incrementable(st2);
		System.out.println("st1 is " + st1.st + ", st2 is " + st2.st);
	}

}
