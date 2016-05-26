package com.furzoom.lab;

public class OutString {
    public static void main(String[] args) {
        final String sourceStr = "Welcome to Furzoom";
        IStringDeal s = new IStringDeal() {
            public String filterBlankChar() {
                String convertStr = sourceStr;
                convertStr = convertStr.replaceAll(" ", "");
                return convertStr;
            }
        };
        System.out.println("Source string: " + sourceStr);
        System.out.println("After relpace: " + s.filterBlankChar());
    }
}

interface IStringDeal {
    public String filterBlankChar();
}
