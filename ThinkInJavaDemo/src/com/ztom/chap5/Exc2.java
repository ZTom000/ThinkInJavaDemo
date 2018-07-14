package com.ztom.chap5;

class InitStr {
	String str = "";
	InitStr(String str){
		this.str = str;
		System.out.println(this.str);
	}
}

public class Exc2 {

	public static void main(String[] args) {
		String str = "A";
		new InitStr(str);
	}

}
