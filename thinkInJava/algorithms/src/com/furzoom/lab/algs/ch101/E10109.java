package com.furzoom.lab.algs.ch101;

public class E10109 {
	public static String toBinaryString(int n)
	{
		String s = "";
		for (int i = n; i > 0; i /= 2)
		{
			s = (i%2) + s;
		}
		return s;
	}

	public static void main(String[] args) 
	{
		System.out.println(toBinaryString(137));
		System.out.println(toBinaryString(13));
	}

}
