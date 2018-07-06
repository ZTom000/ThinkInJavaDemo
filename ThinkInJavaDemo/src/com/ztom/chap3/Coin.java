package com.ztom.chap3;

import java.util.Random;

public class Coin {

	public static void main(String[] args) {
	//	while (0 != 1) {
			Random random = new Random();
			int i = random.nextInt(100);
			if (i % 2 == 0) {
				System.out.println('+');
			}else {
				System.out.println('-');
			}
		//}
	}

}
