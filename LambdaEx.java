package com.oca.prep.day3;
interface Interf
{
	public int square(int n);
}
public class LambdaEx {
public static void main(String args[])
{
	Interf i=n->n*n;
	System.out.println("Square of 4 is :"+ i.square(4));
}
}
