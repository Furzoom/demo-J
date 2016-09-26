package com.furzoom.lab.algs.ch101;

import edu.princeton.cs.algs4.In;

public class E10121
{

    public static void main(String[] args)
    {
        In in = new In(args[0]);
        String[] data = in.readAllStrings();
        for (int i = 0; i < data.length; i += 3)
        {
            String name = data[i];
            int num1 = Integer.parseInt(data[i+1]);
            int num2 = Integer.parseInt(data[i+2]);
            System.out.printf("%-10s: %6d %6d %10.3f\n", name, num1, num2, (double)num1 / num2);
        }
    }
}
