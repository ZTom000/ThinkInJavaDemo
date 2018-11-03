package com.ztom.chap8;

import java.util.Stack;

// Demonstration of Stack Class
public class Stacks {
	static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	public static void main(String[] args) {
		Stack stk = new Stack();
		for (int i = 0; i < months.length; i++) {
			stk.push(months[i]);
		}
		System.out.println("stk = " + stk);
		// Treating a stack as a Vector
	stk.addElement("The last line");
	System.out.println("popping elemnents:");
	while(!stk.empty()) {
		System.out.println(stk.pop());
	}
	}

}