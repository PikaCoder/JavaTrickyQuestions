package com.example1;

public class Example1 {
	static void m1(Object obj){
			System.out.println("Object class method called");
	}
	
	static void m2(String str){
			System.out.println("String class method called");
	}
	
	public static void main(String[] args) {
		Example1.m1(null);
	}
}
