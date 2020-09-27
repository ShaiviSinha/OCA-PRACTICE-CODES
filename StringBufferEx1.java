package com.oca.prep.day2;

public class StringBufferEx1 
{
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer("durga");
	System.out.println(sb.capacity());
	System.out.println(sb.append("soft"));
	System.out.println(sb.append(5));
	System.out.println(sb.append('u'));
	System.out.println(sb.insert(1,'y'));
	System.out.println(sb.insert(2,4));
	System.out.println(sb.insert(2,"shaivi"));
	System.out.println(sb.reverse());
	sb.setLength(4);
	System.out.println(sb);
}
}
