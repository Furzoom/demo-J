package com.furzoom.lab;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Emp emp = new Emp("001", "zhang");
        Emp emp2 = new Emp("005", "li");
        Emp emp3 = new Emp("004", "wang");
        map.put(emp.getE_id(), emp.getE_name());
        map.put(emp2.getE_id(), emp2.getE_name());
        map.put(emp3.getE_id(), emp3.getE_name());

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap:");
        while (it.hasNext()) {
            String str = it.next();
            String name = map.get(str);
            System.out.println(str + " " + name);
        }
        TreeMap<String, String> treemap = new TreeMap<String, String>();
        treemap.putAll(map);
        Iterator<String> iter = treemap.keySet().iterator();
        System.out.println("HashMap:");
        while (iter.hasNext()) {
            String str = iter.next();
            String name = map.get(str);
            System.out.println(str + " " + name);
        }
    }
}

