package com.ztom.chap9;
// Finally is always executed

class Ex extends Exception {
}

public class AlwaysFinally {

	public static void main(String[] args) {
		System.out.println("Entering first try block");
		try {
			System.out.println("Entering second try block");
			try {
				throw new Ex();
			} finally {
				System.out.println("finally in 2nd try block");
			}
		} catch (Ex e) {
			System.out.println("finally in 2nd try block");
		} finally {
			System.out.println("finally in 1st try block");
		}
	}

}
