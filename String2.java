package com.oca.prep;

public class String2 {
public static void main(String args[])
{
	String s1=new String("durga");
	s1.concat("software");
	String s2=s1.concat("solutions");
	s1=s1.concat("soft");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.getClass());
	System.out.println(s1.getClass().getName());
}
}
