package com.ztom.chap4;

public class ForEachInt {
	public static int[] range(int j) {
		int[] a = new int[j];
		for (int k = 0; k < j; k++) {
			a[k] = k;
		}
		return a;
	}

	public static int[] range(int i, int j) {
		int[] a = new int[j - i];
		for (int k = 0; k < j - i; k++) {
			a[k] = k + i;
		}
		return a;
	}

	public static int[] range(int i, int j, int l) {
		int temp = 0;
		int tempI = i;
		while (tempI < j) {
			temp++;
			tempI += l;
		}
		int[] a = new int[temp];
		for (int k = 0; k < temp; k++) {
			a[k] = i += l;
		}
		return a;
	}

	public static void main(String[] args) {
		for (int i : range(10))
			System.out.print(i + " ");
		System.out.println("");
		for(int i : range(5,10))
			System.out.print(i + " ");
		System.out.println("");
		for(int i : range(5,20,3))
			System.out.print(i + " ");
		System.out.println("");
	}

}
