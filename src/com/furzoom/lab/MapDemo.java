package com.furzoom.lab;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "apple");
        map.put("2", "orange");
        map.put("3", "peer");
        for (int i = 1; i <=3; ++i) {
            System.out.println("Element " + i + " is " + map.get("" + i));
        }
    }
}
