package com.oca.prep.day3;

import java.util.function.Predicate;

public class PredicateEx1 {
public static void main(String args[])
{
	String[] s= {"kajal","sunny","Mallika","katrina"};
	Predicate<String> p=s1->s1.charAt(0)=='k';
	for(String s1:s)
	{
		if(p.test(s1))
		{
			System.out.println(s1);
		}
	}
}
}
