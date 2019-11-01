package com.packag;

public class Narrowing1
{
	public static void print(int d)
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		print(10);
		print((int)10.0);
		print('a');
	}

}