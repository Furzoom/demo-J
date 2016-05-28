package com.furzoom.lab;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        String filename = new String("FileTest.txt");
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
            System.out.println("File was deleted");
        } else {
            try {
                file.createNewFile();
                System.out.println("File was created");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


