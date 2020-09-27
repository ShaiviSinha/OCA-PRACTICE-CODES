package com.oca.prep.day2;

public class StringEx1 {
public static void main(String args[])
{
	String s1=new String("durga");
	System.out.println(s1.length());
	String s2=s1.toUpperCase();
	String s3=s1.toLowerCase();
	String s4=s2.toLowerCase();
	String s5=s4.toUpperCase();
	//System.out.println(s.equals(s1));
	//System.out.println(s==s1);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s5==s2);
	
}
}
