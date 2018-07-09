package com.ztom.chap3;

public class Exc14 {

	static boolean f(boolean x) {
		return x;
	}

	static void stringTest(String x, String y) {
		System.out.println(f(x == y));
		System.out.println(f(x != y));
		System.out.println(f(x.equals(y)));
		System.out.println(f(!x.equals(y)));

	}

	public static void main(String[] args) {
		stringTest("abcd", "efgh");
	}

}
