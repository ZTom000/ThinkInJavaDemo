package com.ztom.chap9;

public class Rethrowing {

	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}

	public static void g() throws Throwable{
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(), e.printSteakTrace()");
			e.printStackTrace();
			throw e; 
			// throw e.fillInStackTrace();
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			g();
		} catch (Exception e) {
			System.out.println("Caught in main, e.printSteakTrace()");
			e.printStackTrace();
		}
	}

}
