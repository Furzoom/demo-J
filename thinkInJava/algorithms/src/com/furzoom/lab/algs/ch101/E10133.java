package com.furzoom.lab.algs.ch101;

public class E10133
{
    public static void print(double[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void print(double[] a)
    {
        
    }
    
    public static void main(String[] args)
    {
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {4.0, 5.0, 6.0};
        double[][] a = {x, y}; // 2 x 3
        double[][] b = Matrix.transpose(a);
        System.out.println(Matrix.dot(x, y));
        System.out.println("a:");
        print(a);
        System.out.println("b:");
        print(b);
        double[][] c = Matrix.mult(a, b);
        
        System.out.println("a x b:");
        print(c);
        
        System.out.println("a x y:");
        Matrix.mult(a, y);
    }

}

class Matrix
{
    public static double dot(double[] x, double[] y)
    {
        if (x.length != y.length) 
            throw new IllegalArgumentException("x.length must be equals y.length");
        double res = 0;
        for (int i = 0; i < x.length; i++)
        {
            res += x[i] * y[i];
        }
        return res;
    }
    
    public static double[][] mult(double[][] a, double[][] b)
    {
        if (a[0].length != b.length) 
            throw new IllegalArgumentException("columns of a must equal rows of b");
        int rows = a.length;
        int cols = b[0].length;
        double[][] res = new double[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                double[] x = new double[b.length];
                for (int k = 0; k < x.length; k++)
                {
                    x[k] = b[k][j];
                }
                res[i][j] = dot(a[i], x);
            }
        }
        return res;
    }
    
    public static double[][] transpose(double[][] a)
    {
        int rows = a.length;
        int cols = a[0].length;
        double[][] res = new double[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res[j][i] = a[i][j];
            }
        }
        return res;
    }
    
    public static double[] mult(double[][] a, double[] x)
    {
        if (a[0].length != x.length)
            throw new IllegalArgumentException("columns of a must equal x length");
        double[] res = new double[x.length];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                res[i] += a[i][j] * x[j];
            }
        }
        return res;
    }
    
    public static double[] mult(double[] y, double[][] a)
    {
        return y;
    }
}