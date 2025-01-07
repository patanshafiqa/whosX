package com.javapractise;

public class Staticvariable {
	//instancde area
	int a=10; // instance var
	int b=20;// insta var
	static int c=30;
	static int d=40;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Staticvariable.c);
		System.out.println(Staticvariable.d);
	}
	static void m2()
	{
		
		Staticvariable s=new Staticvariable();
		System.out.println(c);
		System.out.println(d);
		System.out.println(s.a);
		System.out.println(s.b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvariable.m2();
		Staticvariable s1=new Staticvariable();
		s1.m1();
	}

}
