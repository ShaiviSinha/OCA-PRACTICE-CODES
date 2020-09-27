package com.oca.prep;

public class String1
{
	int i;
	String1(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public static void main(String args[])
	{
          String1 s=new String1(26);
          System.out.println(s);
    }
}
