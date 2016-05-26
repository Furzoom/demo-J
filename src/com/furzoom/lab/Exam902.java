package com.furzoom.lab;

public class Exam902 {
    public static void main(String[] args) {
        Exam902 obj = new Exam902();
        System.out.println("Area: " + obj.getArea(10, 9));
    }

    public int getArea(int width, int length) {
        class Area {
            private int w;
            private int l;

            public Area(int w, int l) {
                this.w = w;
                this.l = l;
            }

            public int getArea() {
                return w * l;
            }
        }
        return new Area(width, length).getArea();
    }
}

