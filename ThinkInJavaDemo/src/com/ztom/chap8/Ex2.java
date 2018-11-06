package com.ztom.chap8;

import java.util.Enumeration;
import java.util.Vector;

public class Ex2 {

	public static void main(String[] args) {
		Vector v = new Vector<Gerbil>();
		for (int i = 0; i < 10; i++) {
			Gerbil g = new Gerbil(i);
			v.addElement(g);
		}
		int i = 0;
		for (Enumeration e = v.elements(); e.hasMoreElements();) {
			Gerbil g = (Gerbil) e.nextElement();
			g.hop(i);
			i++;
		}
	}
}
