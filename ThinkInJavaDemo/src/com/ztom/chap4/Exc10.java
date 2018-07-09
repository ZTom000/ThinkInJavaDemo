package com.ztom.chap4;

public class Exc10 {

	public static void main(String[] args) {
		for (int i = 11; i < 100; i++) {
			for (int j = 11; j < 100; j++) {
				if (i * j > 1000) {
					int a, b, c, d;
					int temp = i * j;
					int result = temp;
					a = temp % 10;
					temp /= 10;
					b = temp % 10;
					temp /= 10;
					c = temp % 10;
					temp /= 10;
					d = temp % 10;
					if (((a * 10 + b) == i && (c * 10 + d) == j) || ((a * 10 + b) == i && (d * 10 + c) == j)
							|| ((b * 10 + a) == i && (d * 10 + c) == j) || ((b * 10 + a) == i && (c * 10 + d) == j)) {
						System.out.println(i + " * " + j + " = " + result);
					}
					if (((a * 10 + c) == i && (b * 10 + d) == j) || ((a * 10 + c) == i && (d * 10 + b) == j)
							|| ((c * 10 + a) == i && (b * 10 + d) == j) || ((c * 10 + a) == i && (d * 10 + b) == j)) {
						System.out.println(i + " * " + j + " = " + result);
					}
					if (((c * 10 + b) == i && (a * 10 + d) == j) || ((c * 10 + b) == i && (d * 10 + a) == j)
							|| ((b * 10 + c) == i && (d * 10 + a) == j) || ((b * 10 + c) == i && (a * 10 + d) == j)) {
						System.out.println(i + " * " + j + " = " + result);
					}

				}
			}

		}
	}

}
