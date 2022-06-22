package com.zensar;

public class OverloadExample {
	  public static int area(int side) {
	    //calculates and returns the area of square
	    return side * side;
	  }
	  public static int area(int length, int breadth) {
	    //calculates and returns the area of rectangle
	    return length * breadth;
	  }
	  public static void main(String[] args) {
	    System.out.println(area(5));
	    System.out.println(area(5, 2));
	  }
	}
