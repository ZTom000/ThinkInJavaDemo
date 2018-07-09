package com.ztom.chap4;

public class Exc3 {

	public static void main(String[] args) {
		boolean  bl = false;
		for(int i = 1; i < 100; i++) {
			bl = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					bl = true;
					break;
				}
			}
			if(bl == false)
				System.out.println(i);
	
		}
	}

}
