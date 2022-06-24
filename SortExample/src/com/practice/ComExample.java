package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComExample {
	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(101, "Tom", "943455"));
		emps.add(new Emp(100, "Jerry", "345664"));
		emps.add(new Emp(107, "Pooja", "355532"));
		System.out.println(emps);
		Collections.sort(emps);
		//comaparable - if you have only one logic at one time 
		//comparator - Multiple Logic
		System.out.println(emps);
		System.out.println("Using Id Comparator");
		Collections.sort(emps,new IdComparator());
		System.out.println(emps);
		System.out.println("Using Name Comparator");
		Collections.sort(emps,new NameComparator());
		System.out.println(emps);
	}
}
