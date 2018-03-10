package com.krish.interview;

public class Overload {

	public void m1(String s) {
		System.out.println("String");
	}

	public int m11(String s) {
		System.out.println("String");
		return 0;
	}

	public void m1(StringBuffer s) {
		System.out.println("StringBuffer");
	}

	public void m1(Object s) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Overload().m1(null);
	}

}
