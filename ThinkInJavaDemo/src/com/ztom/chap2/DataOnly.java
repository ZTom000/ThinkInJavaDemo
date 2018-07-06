package com.ztom.chap2;

public class DataOnly {

	private int i;
	private double d;
	private boolean b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1d;
		data.b = false;

		System.out.println(data.i + " " + data.d + " " + data.b);
	}

}
