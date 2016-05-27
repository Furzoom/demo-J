package com.furzoom.lab;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Exam1003 {
    public static void main(String[] args) {
        Map<String, Emp> map = new HashMap<String, Emp>();
        map.put("001", new Emp("001", "zhang"));
        map.put("004", new Emp("004", "wang"));
        map.put("005", new Emp("005", "li"));
        map.remove("005");

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + map.get(key).getE_name());
        }
    }
}
