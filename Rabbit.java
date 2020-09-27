package com.oca.prep.day2;

public class Rabbit {
public static void main(String args[])
{
	Rabbit one=new Rabbit();
	Rabbit two=new Rabbit();
	Rabbit three=one;
	one=null;
	Rabbit four=one;
	three=null;
	two=null;
	two=new Rabbit();
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
}
}
