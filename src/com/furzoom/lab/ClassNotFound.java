package com.furzoom.lab;

public class ClassNotFound {
    private int num = 10;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public ClassNotFound() {
        try {
            Class.forName("com.furzoom.lab");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("test...");
    }

    public static void main(String[] args) {
        ClassNotFound cnf = new ClassNotFound();
        cnf.setNum(888);
        System.out.println(cnf.getNum());
    }
}

