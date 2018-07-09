package com.ztom.chap4;

public class IfElse2 {

	static int test(int testval, int target) {
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0;
	}
	
	static int test(int testval, int begin, int end) {
		if (testval > end)
			return +1;
		else if (testval >= begin && testval <= end)
			return 0;
		else
			return -1;
	}

	public static void main(String[] args) {
		
		System.out.println(test(10, 5));
		System.out.println(test(5, 10));
		System.out.println(test(5, 5));
	}

}
