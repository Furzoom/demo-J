package com.furzoom.lab.algs.ch101;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;


public class Datatype {

	public static void main(String[] args) {
		/**
		 * int
		 * long
		 * short
		 * byte
		 * float
		 * double
		 * boolean
		 * char
		 */
		int n = 100;
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(0, n*n);
		StdDraw.setPenRadius(0.01);
		for (int i = 1; i <= n; ++i)
		{
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}

}
