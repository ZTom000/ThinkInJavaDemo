package com.ztom.chap3;

public class BitOpsExc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		char d = 'b';
		char e = 'c';
		bitCharPrint(c);
		bitCharPrint(d);
		bitCharPrint(e);
	}
	
	static void bitCharPrint(char c) {
		byte b = (byte) c;
		System.out.println(Integer.toBinaryString(b));
	}

}
