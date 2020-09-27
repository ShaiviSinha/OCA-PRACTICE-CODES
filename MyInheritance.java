package com.oca.prep;
class A
{   A()
	{
	System.out.println("a");
	}
void display()
{
	System.out.println("helloooo");
}
	public int a=10;
	int b=20;
	private int c=30;
	protected int d=89;
}
class B extends A
{
	B()
	{
	System.out.println("b");	
	}
	/*void display()
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(d);
	}*/
}
public class MyInheritance {
public static void main(String args[]) {
	A a=new A();
	a.display();
	B b=new B();
	b.display();
}
}
