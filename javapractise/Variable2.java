package com.javapractise;

public class Variable2 {
	// instance variable
	int a=10;
	int b=20;
	int c=30;
	static boolean d;

    static public void m1()
	{
    	Variable2 v=new Variable2();
		System.out.println(v.a);
		System.out.println(v.b);
		
	}
	static void m2()
	{
		Variable2 v3=new Variable2();
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       m1();
       m2();
       
	
	}

}
