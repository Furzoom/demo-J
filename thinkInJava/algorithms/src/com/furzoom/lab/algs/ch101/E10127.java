package com.furzoom.lab.algs.ch101;

public class E10127
{
    private static int count = 0;
    public static double binomial(int n, int k, double p)
    {
        count ++;
        if (n == 0 && k == 0) return 1.0;
        if (n < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
    }

    public static double binomial2(int n, int k, double p)
    {
        double[][] c = new double[n+1][k+1];
        for (int i = 0; i <= n; i++)
        {
            c[i][0] = Math.pow(1.0 - p, i);
        }
        c[0][0] = 1.0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= k; j++)
            {
                c[i][j] = p * c[i-1][j-1] + (1.0 - p) * c[i-1][j];
            }
        }
        return c[n][k];
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        double res = binomial2(n, k, p);
        System.out.println(count + " " + res);
    }

}
