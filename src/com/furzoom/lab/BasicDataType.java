package com.furzoom.lab;

public class BasicDataType {
    public static void main(String[] args) {

        // integer
        byte mybyte = 124;
        short myshort = 32564;
        int myint = 5678989;
        long mylong = 987654321234567890L;
        long resultInteger = mybyte + myshort + myint + mylong;
        System.out.println("All integer is\t: " + resultInteger);

        // float
        float myfloat = 1234567.3456789F;
        double mydouble = 9876543.567890;
        double resultFloat = myfloat + mydouble;
        System.out.println("All float is\t: " + resultFloat);

        // char
        int charD = 'd';
        char charA = 97;
        System.out.println("'d' unicode is\t: " + charD);
        System.out.println("Unicode 97 is\t: " + charA);
        // escape char
        char charBackslash = '\\';
        char charStar = '\u2605';
        System.out.println("Backslash\t: " + charBackslash);
        System.out.println("Star character\t: " + charStar);
        
        // boolean
        boolean myboolean = true;
        System.out.println("true\t\t: " + myboolean);
    }
}
