package com.ztom.chap5;

class Bird{
	int i;
}

class Bush{
	Bush(int i) {}
	Bush(double d){}
}

class Banana{
	void f(int i) {
		
	}
}

class Apricot{
	void pick() {};
	void pit() {
		pick();
	};
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Bird nc = new Bird(); //default!
		//Bush b = new Bush(); 
		Banana a = new Banana(), b = new Banana();
		a.f(1);
		b.f(1);
		
//		Banana.f(a,1);
//		Banana.f(b,2);
	}

}