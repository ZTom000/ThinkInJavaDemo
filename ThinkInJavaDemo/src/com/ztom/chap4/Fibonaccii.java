package com.ztom.chap4;

public class Fibonaccii {

	public static void main(String[] args) {
		int k = 10;
		int x = 1;
		int y = 1;
		for (int i = 0; i < k; i++) {
			int temp = y;
			y += x ;
			x = temp;
			System.out.print(x + " ");
		}
		System.out.println();

	}

}
