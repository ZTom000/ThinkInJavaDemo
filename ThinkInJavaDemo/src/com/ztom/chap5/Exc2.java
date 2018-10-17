package com.ztom.chap5;

class InitStr {
	String str = "";
	int[] a;
	InitStr(String str){
		this.str = str;
		System.out.println(this.str);
		//System.out.println(a);
		int[] a = {1,2,3};
	}
}

public class Exc2 {

	public static void main(String[] args) {
		String str = "A";
		new InitStr(str);
	}

}
