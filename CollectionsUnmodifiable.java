package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	/*
	 *Collections.synchronizedlist
	 *returns a synchronised list which allows multiple thread to access
	 *the list safely
	 */

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.unmodifiableCollection(list);
		List<Integer> unmodifiableList=	Collections.unmodifiableList(list);
		unmodifiableList.add(5);
		//UnsupportedOperationException
		unmodifiableList.forEach(System.out::println);
		NavigableMap<Integer,Integer> map=new TreeMap<>();
		Collections.unmodifiableMap(map);
		Collections.unmodifiableNavigableMap(map);
		NavigableSet<Integer> navigableSet=new TreeSet<>();
		Collections.unmodifiableNavigableSet(navigableSet);
		Collections.unmodifiableSet(navigableSet);
		Collections.unmodifiableSortedMap(map);
		Collections.unmodifiableSortedSet(navigableSet);
}
		
	}
