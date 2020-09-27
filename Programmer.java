package com.oca.prep.day2;
abstract class Writer
{
	public static void Write()
	{
		System.out.println("Writing");
	}
}
class Author extends Writer
{
	public static void Write()
	{
		System.out.println("Writing code");
	}
}
public class Programmer extends Writer{
	public static void Write()
	{
		System.out.println("Writing code");
	}
    public static void main(String args[])
    {
    		Writer w=new Programmer();
    		w.Write();
    }
}
