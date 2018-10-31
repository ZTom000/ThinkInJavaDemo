package com.ztom.chap8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// A simple example using the new Collections
public class SimpleCollenction {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		for (int i = 0; i < 10; i++) {
			c.add(Integer.toString(i));
		}
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
