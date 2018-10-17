package com.ztom.chap5.next;

class TestProtect{
	protected String p = "protect";
	
}

public class Ex2 {
	
	static void setP(TestProtect tp) {
		tp.p = "change";
	}
	
	public static void main(String[] args) {
		TestProtect tp = new TestProtect();
		setP(tp);
		System.out.println(tp.p);
	}
}
