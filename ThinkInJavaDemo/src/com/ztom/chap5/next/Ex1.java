package com.ztom.chap5.next;

class TestPriv {
	private String x = "private";
	public String p = "public";
	protected String y = "protected";
	String f = "friendly";
	
	private String  getX() {
		return x;
	}
	
	public String getP() {
		return p;
	}
	
	protected String getY() {
		return y;
	}
	String getF() {
		return f;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		TestPriv tp = new TestPriv();
		//System.out.println("Method is :" + tp.getX());
		System.out.println("Method is :" + tp.getP());
		System.out.println("Method is :" + tp.getY());
		System.out.println("Method is :" + tp.getF());
		//System.out.println("Var is :" + tp.getX());
		System.out.println("Var is :" + tp.getP());
		System.out.println("Var is :" + tp.getY());
		System.out.println("Var is :" + tp.getF());
	}

}
