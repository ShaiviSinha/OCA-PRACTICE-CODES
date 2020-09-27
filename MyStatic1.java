package com.oca.prep;

class MyStatic {
static int i=10;

	public void display()
	{
		i=12;
	System.out.println(i);
    }
}
public class MyStatic1 extends MyStatic
{
	public static void main(String args[])
	{
		MyStatic t=new MyStatic();
		t.display();
		System.out.println(i);
		
	}
}
