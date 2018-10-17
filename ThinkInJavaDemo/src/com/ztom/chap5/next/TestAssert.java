// Demonstrating the assertion tool
package com.ztom.chap5.next;

//Comment the following, and uncomment the
//subsequent line to change assertion behavior:
import com.ztom.chap5.next.*;

public class TestAssert {

	public static void main(String[] args) {
		Assert.isTrue((2 + 2) == 5);
		Assert.isFalse((1 + 1) == 2);
		Assert.isTrue((2 + 2) == 5, "2 + 2 == 5");
		Assert.isFalse((1 + 1) == 2, "1 + 1 == 5");
	}

}
