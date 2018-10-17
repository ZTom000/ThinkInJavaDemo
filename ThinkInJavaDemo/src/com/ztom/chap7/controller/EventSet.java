package com.ztom.chap7.controller;

//Along with Event,the generic
//framework for all control system;

//This is just a way to hold Event objects
public class EventSet {
	private Event[] events = new Event[100];
	private int index = 0;
	private int next = 0;

	public void add(Event e) {
		if (index >= events.length) {
			return;
		}
		events[index++] = e;
	}

	public Event getNext() {
		boolean looped = false;
		int start = next;
		do {
			next = (next+1)%events.length;
			
		}while(events[next] == null);
		return events[next];
	}
	
	public void removeCurrent() {
		events[next] = null;
	}
}
