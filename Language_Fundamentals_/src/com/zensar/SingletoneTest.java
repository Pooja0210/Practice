package com.zensar;

class Singletone {
	private static Singletone ref = null;

	private Singletone() {}

	public static Singletone getInstance() {
		if(ref ==null) {
			ref = new Singletone();
		}
		return ref;
	}
}

public class SingletoneTest {
	

	public static void main(String[] args) {
		Singletone s = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();
		Singletone s3 = Singletone.getInstance();
		System.out.println(s==s2);     //true
		System.out.println(s2==s3);    //true
		System.out.println(s==s3);     //true
		

	}

}
