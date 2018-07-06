package com.ztom.chap3;

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i : " + i);
		System.out.println("++i : " + ++i);//先++后赋值
		System.out.println("i++ : " + i++);//先赋值后++
		System.out.println("i : " + i);
		System.out.println("--i : " + --i);//先--后赋值
		System.out.println("i-- : " + i--);//先赋值后--
		System.out.println("i : " + i);
	}
}
