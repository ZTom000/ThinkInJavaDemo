package com.ztom.chap3;

public class BitOpsExc2 {
	public static void main(String[] args) {
		int a = 0xffffffff;
		while (a != 0) {
			a <<= 1;
			System.out.println(Integer.toBinaryString(a));
		}

	}

}
