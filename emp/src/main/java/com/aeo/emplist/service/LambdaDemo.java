package com.aeo.emplist.service;

import java.security.PublicKey;

interface A {
	void show();
}

//class xyz implements A
//{

// @Override
// public void show() {
// TODO Auto-generated method stub
// System.out.println("A method");
// }

//}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		// obj = new A()//A() A is interface and dont have constructor,lets implements
		// here
		// {//anonamous inner class we get class name as $1 i e LambdaDemo$1
		// public void show()
		// {
		// System.out.println("Hellow");
		// }

		// };

		obj=()->System.out.println("hi show method");
	obj.show();
		
	}
}
