package com.ztom.chap5.next.debug;

// Assertion tool for debugging
public class Assert {
	private static void perr(String msg) {
		System.err.println(msg);
	}

	public final static void isTrue(boolean exp) {
		if(!exp) {
			perr("Assertion failed");
		}
	}
	
	public final static void isFalse(boolean exp) {
		if(exp) {
			perr("Assertion failed");
		}
	}
	
	public final static void isTrue(boolean exp, String msg) {
		if(!exp) {
			perr("Assertion failed: " + msg);
		}
	}
	public final static void isFalse(boolean exp, String msg) {
		if(exp) {
			perr("Assertion failed: " +msg);
		}
	}
}
