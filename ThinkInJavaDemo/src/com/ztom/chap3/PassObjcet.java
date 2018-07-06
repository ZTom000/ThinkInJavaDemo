package com.ztom.chap3;

public class PassObjcet {
//	static void f(Letter y) {
//		y.c = 'z';	
//	}
	static void f(FloatLetter y) {
		y.c = 5.5f;	
	}
	public static void main(String[] args) {
//		Letter x = new Letter();
//		x.c = 'a';
		FloatLetter x = new FloatLetter();
		x.c = 2.2f;
		System.out.println("1: x.c: " + x.c);
		f(x);
		System.out.println("2: x.c: " + x.c);
	}
}
