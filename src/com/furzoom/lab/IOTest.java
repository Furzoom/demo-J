package com.furzoom.lab;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        String filename = new String("iotest.txt");
        //FileReader reader = new FileReader(filename);
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(filename);
            writer.close();
            System.out.println("write ok");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(filename);
            char[] temp = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (reader.read(temp) != -1) {
                sb.append(temp);
            }
            System.out.println(sb.toString());
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

