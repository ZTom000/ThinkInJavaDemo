package com.ztom.chap4;

import java.util.Scanner;

public class Exc2 {
	
	static void excOne() {
		int a[] = new int[25];
		for (int i = 0; i < 25; i++)
			a[i] = (int) (Math.random()*100);
		for (int i = 0; i < 24; i++)
			if (a[i] > a[i + 1])
				System.out.println(a[i] + ">" + a[i + 1]);
			else if(a[i] == a[i + 1])
				System.out.println(a[i] + "==" + a[i + 1]);
			else
				System.out.println(a[i] + "<" + a[i + 1]);
	}
	static void excTwo() {
		Scanner scan = new Scanner(System.in);
		do {
			int a = (int) (Math.random()*100);
			int b = (int) (Math.random()*100);
			if (a > b)
				System.out.println(a + ">" + b);
			else if(a == b)
				System.out.println(a + "==" + b);
			else
				System.out.println(a + "<" + b);
			
		}while(!(scan.next() == null));
		scan.close();
		
	}
	public static void main(String[] args) {
		//excOne();
		excTwo();
		
	}
}
