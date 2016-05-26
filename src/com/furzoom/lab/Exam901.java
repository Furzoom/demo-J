package com.furzoom.lab;

public class Exam901 {
    public static void main(String[] args) {
        Exam901 obj = new Exam901();
        System.out.println("Sum(1...10): " + obj.getSum(10));
    }

    class CalSum {
        private int n;
        public CalSum(int n) {
            this.n = n;
        }
        public int getSum() {
            int sum = 0;
            for (int i = 1; i <= n; ++i) {
                sum += i;
            }
            return sum;
        }
    }
    
    public int getSum(int n) {
        CalSum cs = new CalSum(n);
        return cs.getSum();
    }
}

