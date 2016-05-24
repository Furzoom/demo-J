package com.furzoom.lab;

import java.lang.reflect.Field;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Class<?> clazz = student.getClass();
        System.out.println("Class name: " + clazz.getCanonicalName());
        try {
            Field id = clazz.getDeclaredField("id");
            System.out.println("before set id: " + student.getId());
            id.setAccessible(true);
            id.setInt(student, 10);
            System.out.println("After set id: " + student.getId()); 

            Field name = clazz.getDeclaredField("name");
            System.out.println("before set name: " + student.getName());
            name.setAccessible(true);
            name.set(student, "furzoom");
            System.out.println("After set name: " + student.getName());

            Field gender = clazz.getDeclaredField("gender");
            System.out.println("before set gender: " + student.getGender());
            gender.setAccessible(true);
            gender.setBoolean(student, false);
            System.out.println("After set gender: " + student.getGender());

            Field account = clazz.getDeclaredField("account");
            System.out.println("before set account: " + student.getAccount());
            account.setAccessible(true);
            account.setDouble(student, 1000.12);
            System.out.println("After set account: " + student.getAccount());
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

