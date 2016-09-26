package com.furzoom.lab.algs.ch101;

public class E10111
{

    public static void main(String[] args)
    {
        boolean[][] bArray = {
                {true, false, true, false, false},
                {false, false, true, true, true},
                {true, true, false, false, false}
        };
        System.out.print("  ");
        for (int i = 0; i < bArray[0].length; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i < bArray.length; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < bArray[i].length; j++)
            {
                if (bArray[i][j])
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
