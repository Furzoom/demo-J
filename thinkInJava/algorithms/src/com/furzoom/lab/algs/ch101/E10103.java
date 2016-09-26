package com.furzoom.lab.algs.ch101;

import edu.princeton.cs.algs4.StdOut;

public class E10103 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		if (num1 == num2 && num1 == num3) 
		{
			StdOut.println("equal");
		}
		else
		{
			StdOut.println("not equal");
		}
	}

}
