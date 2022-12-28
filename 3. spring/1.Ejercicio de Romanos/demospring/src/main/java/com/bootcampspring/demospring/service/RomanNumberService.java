package com.bootcampspring.demospring.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberService {
    public Map map = new LinkedHashMap<String, Integer>();

    public String romanNumber(int numberA) {
        populateMap();
        String result = "";
        int number = numberA;
        while (number > 0) {
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Integer> entry = it.next();
                if (number >= entry.getValue()) {
                    number -= entry.getValue();
                    result += entry.getKey();
                    break;
                }
            }
        }
        return result;
    }

    public void populateMap() {
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
    }
}
