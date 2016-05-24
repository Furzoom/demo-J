package com.furzoom.lab;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private double account;

    public Student() {
        this.id = 0;
        this.name = "";
        this.gender = true;
        this.account = 0.0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getAccount() {
        return this.account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}

