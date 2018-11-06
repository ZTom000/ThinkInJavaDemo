package com.ztom.chap8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

// Using the Collections.unmodifiable methods
public class ReadOnly {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collection1.fill(c); // Insert useful data
		c = Collections.unmodifiableCollection(c);
		Collection1.print(c); // Reading is OK
		// ! c.add("one"); // Can`t change it

		List a = new ArrayList();
		Collection1.fill(a);
		a = Collections.unmodifiableList(a);
		ListIterator lit = (ListIterator) a.listIterator();
		try {
			System.out.println(lit.next());
		} catch (SAXException | JAXBException e) {
			e.printStackTrace();
		} // Reading OK
			// ! lit.add("one") // Can`t change it

		Set s = new HashSet();
		Collection1.fill(s);
		s = Collections.unmodifiableSet(s);
		Collection1.print(s); // Reading OK
		//! s.add("one"); // Can`t change it
		
		Map m = new HashMap();
		Map1.fill(m, Map1.testData1);
		m = Collections.unmodifiableMap(m);
		Map1.print(m); // Reading OK
		//! m.put("Ralph", "Howdy!");
	}

}
