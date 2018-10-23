package com.ztom.chap6;

class A {
	A a;

	A() {
		// a = new A();
		System.out.println("I`m A.");
	}

	A(A a) {
		this.a = a;
		System.out.println("I`m A = a.");
	}
}

class B {
	B b;

	B() {
		// b = new B();
		System.out.println("I`m B.");
	}

	B(B b) {
		this.b = b;
		System.out.println("I`m B = b.");
	}
}

class C extends A {
	B b;
	C(B b){
		this.b = b;
		System.out.println("I`m c.");
	}
}

public class Constructor {

	public static void main(String[] args) {
		B b = new B();
		C c = new C(b);
	}

}
