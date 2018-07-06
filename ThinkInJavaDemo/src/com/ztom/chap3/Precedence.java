package com.ztom.chap3;

public class Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println(a);
		System.out.println(b);
	}

}
