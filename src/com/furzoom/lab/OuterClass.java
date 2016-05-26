package com.furzoom.lab;

public class OuterClass {
    InnerClass in = new InnerClass();
    public void ouf() {
        in.inf();
    }
    class InnerClass {
        InnerClass() {
        }
        public void inf() {
            System.out.println("InnerClass.inf()");
        }
        int y = 0;
    }
    public InnerClass doit() {
        in.y = 4;
        return new InnerClass();
    }
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.doit();
    }
}


