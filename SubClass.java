package com.oca.prep.day2;
class SuperClass
{
	SuperClass(int x)
	{
		System.out.println("super");
	}
}
public class SubClass extends SuperClass {
SubClass()
{
	super(10);
	System.out.println("sub 2");
}
}
