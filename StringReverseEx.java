package com.oca.prep.day2;

public class StringReverseEx {
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer("shaivi");
	System.out.println(sb.capacity());
	sb.reverse();
	System.out.println(sb);
	String s1="shaivi";
	char[] ch=s1.toCharArray();
	System.out.println(ch);
	StringBuilder s2=new StringBuilder(s1);
	System.out.println(s2.capacity());
	System.out.println(s2.reverse());
}
}
