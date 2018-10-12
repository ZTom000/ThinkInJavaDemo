package com.ztom.chap7;

public class Parcel1 {

	class Contents {
		private int i = 11;

		public int value() {
			System.out.println(i);
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			System.out.println(label);
			return label;
		}

	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel1 p = new Parcel1();
		p.ship("Tanzania");
	}

}
