package com.ztom.chap3;

public class BitOps {

	public static void main(String[] args) {
		int i = 0x5;
		int j = 0xa;
		System.out.println(Integer.toBinaryString(i & j));
		System.out.println(Integer.toBinaryString(i | j));
		System.out.println(Integer.toBinaryString(i ^ j));
	}

}
