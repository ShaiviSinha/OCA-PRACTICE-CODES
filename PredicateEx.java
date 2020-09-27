package com.oca.prep.day3;

import java.util.function.Predicate;

public class PredicateEx {
public static void main(String args[])
{
	Predicate<Integer> p= i->i>10;
	System.out.println(p.test(100));
	
}
}
