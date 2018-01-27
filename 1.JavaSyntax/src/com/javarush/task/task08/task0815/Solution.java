package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Вася");
        map.put("Васильев", "Петр");
        map.put("Макеев", "Евгений");
        map.put("Александров", "Роман");
        map.put("Ковалевский", "Евгений");
        map.put("Матвеева", "Светлана");
        map.put("Васильева", "Светлана");
        map.put("Лисицина", "Наталья");
        map.put("Александрова", "Кристина");
        map.put("Иванова", "Любовь");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int vCount = 0;
        for (String v : map.values()) {
            if (v.equals(name)) {
                vCount++;
            }
        }
        return vCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int kCount = 0;
        for (String k : map.keySet()) {
            if (k.equals(lastName)) {
                kCount++;
            }
        }
        return kCount;
    }

    public static void main(String[] args) {

    }
}
