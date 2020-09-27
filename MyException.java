package com.oca.prep;

public class MyException {
public static void main(String args[])
{
	/*try
	{
		System.out.println("try blockk");
		if(120<10)
		{
			System.out.println("again try");
		}
	}
	catch(InsufficientValueException e)
	{
		
	}
	/*catch(ArithmeticException e)
	{
		System.out.println("this is us");
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block");
	}
	
	try
	{
		System.out.println(10/0);
	}
	System.out.println("hi");
	catch(ArithmeticException e)
	{
		
	}
	int a[]= {1,2,3};
	
	String s="java";
	s.concat(" se 6");
	s.replace('6', '7');
	System.out.println(s);*/
	static int x=10;
	int y=new MyException().change(x);
	System.out.println(x+y);
}
int change()
{
	int y=12;
	return y;
}
}

