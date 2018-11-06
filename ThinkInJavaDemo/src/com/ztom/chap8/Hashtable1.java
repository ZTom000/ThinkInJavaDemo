package com.ztom.chap8;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

//Simple version of a Dictionary
public class Hashtable1 {
	private Vector keys = new Vector();
	private Vector values = new Vector();

	public int size() {
		return keys.size();
	}

	public boolean isEmpty() {
		return keys.isEmpty();
	}

	public Object put(Object key, Object value) {
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

	public Object get(Object key) {
		int index = keys.indexOf(key);
		// indexOf() Returns -1 if key not found;
		if (index == -1) {
			return null;
		}
		return values.elementAt(index);
	}

	public Object remove(Object key) {
		int index = keys.indexOf(key);
		if (index == -1) {
			return null;
		}
		keys.removeElement(index);
		Object returnval = values.elementAt(index);
		values.removeElementAt(index);
		return returnval;
	}

	public Enumeration keys() {
		return keys.elements();
	}

	public Enumeration elements() {
		return values.elements();
	}

	// Test it:
	public static void main(String[] args) {
		//AssocArray aa = new AssocArray();
		Hashtable ht = new Hashtable();
		for (char c = 'a'; c < 'z'; c++) {
			ht.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		}
		char[] ca = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < ca.length; i++) {
			System.out.println("Uppercase: " + ht.get(String.valueOf(ca[i])));
		}

	}

}
