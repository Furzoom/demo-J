package com.furzoom.lab;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) {
        String filename = new String("streamtest.txt");
        File file = new File(filename);
        try {
            FileOutputStream out = new FileOutputStream(file);
            String str = "枫竹梦furzoom";
            byte[] content = str.getBytes();
            out.write(content);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream(file);
            byte[] content = new byte[1024];
            int len = in.read(content);
            System.out.println(new String(content, 0, len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
