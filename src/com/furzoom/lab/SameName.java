package com.furzoom.lab;

public class SameName {
    private int x = 2;
    private Inner inner;
    SameName() {
        inner = new Inner();
    }
    private class Inner {
        private int x = 9;
        public void doit(int x) {
            x++;
            this.x++;
            SameName.this.x++;
            System.out.println(x + "\t" + this.x + "\t" + SameName.this.x);
        }
    }
    public static void main(String[] args) {
        SameName sn = new SameName();
        sn.inner.doit(20);
    }
}
