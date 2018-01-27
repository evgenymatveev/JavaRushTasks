package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        int index = 0;
        HashMap<String, String> tmp = new HashMap<>(map);
        for (HashMap.Entry<String, String> v1 : tmp.entrySet()) {
            String valueTmp = v1.getValue();
            for (HashMap.Entry<String, String> v2 : tmp.entrySet()) {
                if (v2.getValue().equals(valueTmp)) {
                    index++;
                }
                if (index > 1) {
                    removeItemFromMapByValue(map, v2.getValue());
                    index = 0;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
