package com.ztom.chap3;

import java.util.Random;

public class BitManipulation {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		System.out.println("-1 : " + (-1) + "\n" + Integer.toBinaryString(-1));
		System.out.println("+1 : " + (+1) + "\n" + Integer.toBinaryString(+1));
		int maxpos = 2147483647;
		System.out.println("maxpos :" + maxpos + "\n" + Integer.toBinaryString(maxpos));
		int maxneg = -2147483648;
		System.out.println("maxneg :" + maxneg + "\n" + Integer.toBinaryString(maxneg));
		System.out.println("i:" + i + "\n" + Integer.toBinaryString(i));
		System.out.println("~i:" + (~i) + "\n" + Integer.toBinaryString(~i));
		System.out.println("-i:" + (-i) + "\n" + Integer.toBinaryString(-i));
		System.out.println("j:" + j + "\n" + Integer.toBinaryString(j));
		System.out.println("i & j:" + (i & j) + "\n" + Integer.toBinaryString(i & j));
		System.out.println("i | j:" + (i | j) + "\n" + Integer.toBinaryString(i | j));
		System.out.println("i ^ j:" + (i ^ j) + "\n" + Integer.toBinaryString(i ^ j));
		System.out.println("i << 5" + (i << 5) + "\n" + Integer.toBinaryString(i << 5));
		System.out.println("i >> 5" + (i >> 5) + "\n" + Integer.toBinaryString(i >> 5));
		System.out.println("(~i) >> 5" + ((~i) >> 5) + "\n" + Integer.toBinaryString((~i) >> 5));
		System.out.println("i >>> 5" + (i >>> 5) + "\n" + Integer.toBinaryString(i >>> 5));
		System.out.println("(~i) >>> 5" + ((~i) >>> 5) + "\n" + Integer.toBinaryString((~i) >>> 5));

		long l = rand.nextLong();
		long m = rand.nextLong();
		System.out.println("-1L" + -1L + "\n" + Long.toBinaryString(-1L));
		System.out.println("+1L" + +1L + "\n" + Long.toBinaryString(+1L));
		long ll = 9223372036854775807L;
		System.out.println("maxpos :" + ll + "\n" + Long.toBinaryString(ll));
		long lln = -9223372036854775808L;
		System.out.println("maxneg :" + lln + "\n" + Long.toBinaryString(lln));
		System.out.println("l:" + l + "\n" + Long.toBinaryString(l));
		System.out.println("~l:" + (~l) + "\n" + Long.toBinaryString(~l));
		System.out.println("-l:" + (-l) + "\n" + Long.toBinaryString(-l));
		System.out.println("m:" + m + "\n" + Long.toBinaryString(m));
		System.out.println("l & m:" + (l & m) + "\n" + Long.toBinaryString(l & m));
		System.out.println("l | m:" + (l | m) + "\n" + Long.toBinaryString(l | m));
		System.out.println("l ^ m:" + (l ^ m) + "\n" + Long.toBinaryString(l ^ m));
		System.out.println("l << 5" + (l << 5) + "\n" + Long.toBinaryString(l << 5));
		System.out.println("l >> 5" + (l >> 5) + "\n" + Long.toBinaryString(l >> 5));
		System.out.println("(~l) >> 5" + ((~l) >> 5) + "\n" + Long.toBinaryString((~l) >> 5));
		System.out.println("l >>> 5" + (l >>> 5) + "\n" + Long.toBinaryString(l >>> 5));
		System.out.println("(~l) >>> 5" + ((~l) >>> 5) + "\n" + Long.toBinaryString((~l) >>> 5));
	}
}
