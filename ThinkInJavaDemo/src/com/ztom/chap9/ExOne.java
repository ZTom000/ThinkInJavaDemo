package com.ztom.chap9;

public class ExOne {

	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("this is catch.");
		} finally {
			System.out.println("this is finally.");
		}

	}

}
