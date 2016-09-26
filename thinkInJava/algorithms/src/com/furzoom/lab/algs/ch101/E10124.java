package com.furzoom.lab.algs.ch101;


public class E10124
{

    public static int euclid(int p, int q)
    {
        System.out.printf("p: %d\tq: %d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
    
    public static void main(String[] args)
    {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(euclid(p, q));
    }

}
