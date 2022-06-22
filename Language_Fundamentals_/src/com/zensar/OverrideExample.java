package com.zensar;

class Pet {
	public void displayInfo() {
		System.out.println("I am a Pet.");
	}
}

class Dog extends Pet {
	@Override
	public void displayInfo() {
		System.out.println("I am a dog.");
	}
}

public class OverrideExample {
	public static void main(String[] args) {
		Pet p1 = new Pet();
		Pet d1 = new Dog();
		p1.displayInfo();
		d1.displayInfo();
	}
}
