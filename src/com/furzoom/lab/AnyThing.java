package com.furzoom.lab;

public class AnyThing {
    public AnyThing() {
        this("I'm from AnyTing()");
        System.out.println("AnyThing()");
    }

    public AnyThing(String name) {
        System.out.println("AnyThins(String name)");
    }

    public static void main(String[] args) {
        System.out.println("args.length: " + args.length);
        AnyThing at = new AnyThing();
    }
}
