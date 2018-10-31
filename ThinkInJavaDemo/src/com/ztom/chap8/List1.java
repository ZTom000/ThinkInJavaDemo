package com.ztom.chap8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

//Things you can do with Lists
public class List1 {
	// Wrap Collection1.fill() for convenience:
	public static List fill(List a) {
		return (List) Collection1.fill(a);
	}

	// You can use an Iterator, just as with a
	// Collection, but you can also use random
	// access with get();
	public static void print(List a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}

	static boolean b;
	static Object o;
	static int i;
	static Iterator it;
	static ListIterator lit;

	public static void basicTest(List a) {
		a.add(1, "x"); // Add at location 1
		a.add("x"); // Add at end
		// Add a collection:
		a.addAll(fill(new ArrayList()));
		// Add a collection starting at location 3:
		a.addAll(3, fill(new ArrayList()));
		b = a.contains("1"); // Is it in there?
		// Is the entire colection in there?
		b = a.containsAll(fill(new ArrayList()));
		// Lists allow random access, which is cheap
		// for ArrayList, expensive for LinkedList:
		o = a.get(1); // Get object at location 1
		i = a.indexOf("1"); // Tell index of object
		// indexOf, starting search at location 2:
		//i = a.indexOf("1", 2);
		b = a.isEmpty(); // Any elements inside?
		it = a.iterator(); // Ordinary Iterator
		lit = (ListIterator) a.listIterator(); // ListIterator
		lit = (ListIterator) a.listIterator(3); // Start at loc 3
		i = a.lastIndexOf("1"); // Last match
		//i = a.lastIndexOf("1", 2); // ...after loc 2
		a.remove(1); // Remove location 1
		a.remove("3"); // Remove this object
		a.set(1, "y"); // Setlocation 1 to "y"
		// Keep everything that`s in this range
		// (the intersecion of the two sets)
		a.retainAll(fill(new ArrayList()));
		// Remove elements in this range:
		//a.removeRange(2, 0);
		// Remove everything that`s in the argument:
		a.removeAll(fill(new ArrayList()));
		i = a.size();// How big is it?
		a.clear();
	}

	public static void iterMotion(List a) throws SAXException, JAXBException {
		ListIterator it = (ListIterator) a.listIterator();
		b = it.hasNext();
		b = ((java.util.ListIterator) it).hasPrevious();
		o = it.next();
		i = ((java.util.ListIterator) it).nextIndex();
		o = ((java.util.ListIterator) it).previous();
		i = ((java.util.ListIterator) it).previousIndex();
	}

	public static void iterManipulation(List a) throws SAXException, JAXBException {
		ListIterator it = (ListIterator) a.listIterator();
		((java.util.ListIterator) it).add("47");
		// Must move to an element after add():
		it.next();
		// Remove the element that was just produced
		 ((java.util.ListIterator) it).remove();
		// Must move to an element after remove():
		it.next();
		// Change the element that was just produced:
		((java.util.ListIterator) it).set("47");
	}

	public static void testVisual(List a) throws SAXException, JAXBException {
		print(a);
		List b = new ArrayList();
		fill(b);
		System.out.println("b = ");
		print(b);
		a.addAll(b);
		a.addAll(fill(new ArrayList()));
		print(a);
		// Shrink the list by removing all the
		// elements beyond the first 1/2 of the list
		System.out.println(a.size());
		System.out.println(a.size() / 2);
		//a.removeRange(a.size() / 2, a.size() / 2 + 2);
		print(a);
		// Insert,remove, and replace elements
		// using a ListIterator:
		ListIterator x = (ListIterator) a.listIterator(a.size() / 2);
		((java.util.ListIterator) x).add("one");
		print(a);
		System.out.println(x.next());
		((java.util.ListIterator) x).remove();
		System.out.println(x.next());
		((java.util.ListIterator) x).set("47");
		print(a);
		// Traverse the list backwards:
		x = (ListIterator) a.listIterator(a.size());
		while (((java.util.ListIterator) x).hasPrevious()) {
			System.out.println(((java.util.ListIterator) x).previous() + " ");
		}
		System.out.println();
		System.out.println("testVisual finished");
	}

	// There are some things that only
	// LinkedLists can do:
	public static void testLinkedList() {
		LinkedList ll = new LinkedList();
		Collection1.fill(ll, 5);
		print(ll);
		//Treat it like a stack, pushing:
		ll.addFirst("one");
		ll.addFirst("two");
		print(ll);
		// Like "peeking" at the top of a stack:
		System.out.println(ll.getFirst());
		// Like popping a stack:
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeFirst());
		// Treat it like a queue,pulling elements
		// off the tail end:
		System.out.println(ll.removeLast());
		// With the above operations, it`s a dequeue!
		print(ll);
	}

	public static void main(String[] args) throws SAXException, JAXBException {
		// Make and fill a new list each time:
		basicTest(fill(new LinkedList()));
		basicTest(fill(new ArrayList()));
		iterMotion(fill(new LinkedList()));
		iterMotion(fill(new ArrayList()));
		iterManipulation(fill(new LinkedList()));
		iterManipulation(fill(new ArrayList()));
		testVisual(fill(new LinkedList()));
		testLinkedList();
	}

}
