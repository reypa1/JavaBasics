package com.krish.interview;

public class B extends A {
	int a = 20;

	public int m1() {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b =   new A();
		A b =  new B();
		System.out.println(b.a);
		System.out.println(b.m1());
	}

}
