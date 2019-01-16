package com.ztom.chap9;

class TestException extends Exception {
	public TestException() {
	}

	public TestException(String msg) {
		super(msg);
	}

}

public class ExTwo {

	public static void main(String[] args) {
		try {
			throw new TestException("I`m TestException.");
		}catch (TestException e) {
			e.printStackTrace();
		}
	}

}
