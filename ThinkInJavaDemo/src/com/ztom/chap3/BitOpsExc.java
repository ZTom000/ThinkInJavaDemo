package com.ztom.chap3;

public class BitOpsExc {

	public static void main(String[] args) {
		int a = 0xfffffff;
		while (a != 0) {
			a >>= 1;
			System.out.println(Integer.toBinaryString(a));
		}

	}

}
