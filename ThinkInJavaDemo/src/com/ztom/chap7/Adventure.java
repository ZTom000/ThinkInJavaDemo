package com.ztom.chap7;
// Multiple interface

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

	@Override
	public void fly() {
	}

	@Override
	public void swim() {
	}

}

public class Adventure {
	static void t(CanFight x) {
		x.fight();
	}

	static void u(CanSwim x) {
		x.swim();
	}

	static void v(CanFly x) {
		x.fly();
	}

	static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero i = new Hero();
		t(i); // Treat it as a CanFight
		u(i); // Treat it as a CanSwim
		v(i); // Treat it as a CanFly
		w(i); // Treat it as an ActionCharacter

	}

}
