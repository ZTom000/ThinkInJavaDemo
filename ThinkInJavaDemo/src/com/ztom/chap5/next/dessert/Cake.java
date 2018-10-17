package com.ztom.chap5.next.dessert;

// Accesses a class in a separate
// compilation unit.
class Cake {
	public static void main(String[] args) {
		Pie x = new Pie();
		x.f();
	}
}

//The other class
class Pie {
	void f() {
		System.out.println("Pie.f()");
	}
}