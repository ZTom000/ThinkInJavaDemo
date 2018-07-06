package com.ztom.chap3;

public class Assignment {

	public static void main(String[] args) {
//		Tank t1 = new Tank();
//		Tank t2 = new Tank();
//		t1.level = 9;
//		t2.level = 47;
		FloatTank t1 = new FloatTank();
		FloatTank t2 = new FloatTank();
		t1.level = 9.9f;
		t2.level = 47.4f;
		System.out.println("1:t1.level=" + t1.level + ",t2.level=" + t2.level);
		t1 = t2;																//t1对象的hashCode与值均被赋值为对象t2
		System.out.println("2:t1.level=" + t1.level + ",t2.level=" + t2.level);
//		t1.level = 27;
		t1.level = 27.7f;
		System.out.println("3:t1.level=" + t1.level + ",t2.level=" + t2.level);
	}

}
