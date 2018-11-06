package com.ztom.chap8;

import java.util.Vector;

class Gerbil {
	int gerbilNumber;

	Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop(int gerbilNumber) {
		if (this.gerbilNumber == gerbilNumber) {
			System.out.println(this.gerbilNumber);
		}
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Vector v = new Vector<Gerbil>();
		for (int i = 0; i < 10; i++) {
			Gerbil g = new Gerbil(i);
			v.addElement(g);
		}
		for (int i = 0; i < 10; i++) {
			Gerbil g = (Gerbil) v.elementAt(i);
			g.hop(i);
		}
	}

}
