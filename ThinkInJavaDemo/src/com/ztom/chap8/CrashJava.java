package com.ztom.chap8;

import java.util.Vector;

// One way to crash Java
public class CrashJava {

	public String toString() {
		return "CrashJava address: " + this + "\n";
	}
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i<10;i++) {
			v.addElement(new CrashJava());
		}
		System.out.println(v);
	}

}
