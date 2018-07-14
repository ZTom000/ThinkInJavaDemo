package com.ztom.chap5;

class Rock {
	Rock() {
		System.out.println("Rock");
	}
}

class Rock2{
	Rock2(int i){
		System.out.println("Rock " + i + " ");
	}
}
public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();	
			new Rock2(i);
		}

	}

}
