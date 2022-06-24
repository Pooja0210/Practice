package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(12);
		marks.add(34);
		marks.add(7);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
	}

}
