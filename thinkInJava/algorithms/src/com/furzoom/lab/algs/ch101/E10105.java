package com.furzoom.lab.algs.ch101;

import edu.princeton.cs.algs4.StdOut;

public class E10105 {

	public static void between0and1(double key)
	{
		StdOut.println(key > 0 && key < 1);
	}
	
	public static void main(String[] args) 
	{
		between0and1(1.1);
		between0and1(0.8);
		between0and1(0);
		between0and1(1);
	}

}
