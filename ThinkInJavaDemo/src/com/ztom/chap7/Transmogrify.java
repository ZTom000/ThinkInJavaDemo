package com.ztom.chap7;

//Dynamically changing the behavior of
//an object via composition.

interface Actor {
	void act();
}

class HappyActor implements Actor {

	@Override
	public void act() {
		System.out.println("HappyActor");
	}

}

class SadActor implements Actor{
	public void act() {
		System.out.println("SedActor");
	}
}

class Stage{
	Actor a = new HappyActor();
	void change() {
		a = new SadActor();
	}
	void go() {
		a.act();
	}
}

public class Transmogrify {

	public static void main(String[] args) {
		Stage s = new Stage();
		s.go();
		s.change();
		s.go();

	}

}
