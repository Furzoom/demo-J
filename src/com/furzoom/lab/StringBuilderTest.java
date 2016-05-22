package com.furzoom.lab;

public class StringBuilderTest {
    public static void main(String[] args) {
        //addString(10000);


        // sb.append(String s)
        String s1 = "good";
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s1);
        System.out.println("sb1 After append: " + sb1);


        // sb.append(StringBuffer buf)
        StringBuffer buf = new StringBuffer("job");
        sb1.append(buf);
        System.out.println("sb1 After append buf: " + sb1);


        // sb.insert(int offset, String str)
        String s2 = "man";
        sb1.insert(1, s2);
        System.out.println("sb1 After insert \"man\": " + sb1);


        // sb.delete(int start, int end)
        sb1.delete(4, 7);
        System.out.println("sb1 After delete : " + sb1);


        // sb.deleteCharAt(int pos)
        sb1.deleteCharAt(4);
        System.out.println("sb1.deleteCharAt(4): " + sb1);


        // sb.toString()
        System.out.println("sb1.toString : " + sb1.toString());

        // samples
        String text = "枫竹梦furzoom";
        char[] charArray = text.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (char c : charArray) {
            sb2.append((int)c + " ");
        }
        System.out.println(text + "'s Unicode is : " + sb2.toString());


        text = "FURZOOM";
        char secret = '1';
        System.out.println("Origin(" + text.length() + "): " + text);
        String encrypt = EAndU(text, secret);
        System.out.println("Encrypt(" + encrypt.length() + "): " + encrypt);
        String uncrypt = EAndU(encrypt, secret);
        System.out.println("Uncrypt(" + uncrypt.length() + "): " + uncrypt);
    }
        
    public static void addString(long count) {
        String s1 = "";
        long startTime = System.currentTimeMillis();
        long i;
        for (i = 0; i < count; ++i) {
            s1 += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String : " + (endTime - startTime) + "ms");

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (i = 0; i < count; ++i) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (endTime - startTime) + "ms");
    }

    public static String EAndU(String value, char secret) {
        byte[] bt = value.getBytes();
        for (int i = 0; i < bt.length; ++i) {
            bt[i] = (byte)(bt[i] ^ (int)secret);
        }
        return new String(bt);
    }
}
