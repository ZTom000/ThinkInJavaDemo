package com.ztom.chap4;

import java.util.Random;

public class Exc8 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			System.out.println((char) c + ", " + c + ":");
			switch (c) {
			case 'a':
				//break;
			case 'e':
				//break;
			case 'i':
				//break;
			case 'o':
				//break;
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
				//break;
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
			default:
				System.out.println("consonant");
				break;
			}
		}

	}
}
