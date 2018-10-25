package com.ztom.chap7;

class Rodent{
	void move() {}
}
class Mouse extends Rodent{
	void move() {
		System.out.println("Mouse can run.");
	}
}

class Gerbil extends Rodent{
	void move() {
		System.out.println("Gerbil can run.");
	}
}

class Hamster extends Rodent{
	void move() {
		System.out.println("Hamster can run.");
	}
}
public class RodentTest {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		Gerbil g = new Gerbil();
		Hamster h = new Hamster();
		m.move();
		g.move();
		h.move();
		
	}

}
