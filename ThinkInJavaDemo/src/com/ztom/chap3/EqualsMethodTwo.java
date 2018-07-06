package com.ztom.chap3;


class Value{
	int i;
}
public class EqualsMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Value v1 = new Value();
			Value v2 = new Value();
			v1.i = v2.i = 1;
			System.out.println(v1.equals(v2));
	}

}
