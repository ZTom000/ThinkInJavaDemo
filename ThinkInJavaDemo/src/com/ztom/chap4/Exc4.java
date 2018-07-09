package com.ztom.chap4;

public class Exc4 {

	public static void main(String[] args) {
		String str = "";
		int i = 1220;
		while (i != 0) {
			int tmep = (i % 2 == 0) ? 0 : 1;
			str += Integer.toString(tmep);
			i >>= 1;
		}
		System.out.println(str);
	}

}
