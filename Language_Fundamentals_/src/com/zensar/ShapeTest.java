package com.zensar;
abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a line");
	}	
}
class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}	
}
class Cube extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a cube");
	}	
}
public class ShapeTest {

	public static void main(String[] args) {
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[1]=new Rectangle();
		s[2]=new Cube();
		for(int i = 0;i<s.length;i++) {
			s[i].draw();	
		}
		
	}

}