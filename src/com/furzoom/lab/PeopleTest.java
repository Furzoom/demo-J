package com.furzoom.lab;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class PeopleTest {
    public static void main(String[] args) {
        Set<People> hashSet = new HashSet<People>();
        hashSet.add(new People("Chen", 201601));
        hashSet.add(new People("Wang", 201602));
        hashSet.add(new People("Li", 201603));
        Iterator<People> it = hashSet.iterator();
        System.out.println("Set: ");
        while (it.hasNext()) {
            People person = it.next();
            System.out.println(person.getName() + " " + person.getId_card());
        }
    }
}
