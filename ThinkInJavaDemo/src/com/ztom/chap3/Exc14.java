package com.ztom.chap3;

public class Exc14 {

	static void f(boolean x) {
	}

	static void stringTest(String x, String y) {
		f(x == y);
		f(x != y);
		f(x.equals(y));
		f(!x.equals(y));
	}

	public static void main(String[] args) {
		stringTest("abcd", "efgh");
	}

}
