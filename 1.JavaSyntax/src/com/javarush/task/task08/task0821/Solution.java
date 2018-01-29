package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> tmp = new HashMap<>();
        tmp.put("Иванов", "Вася");
        tmp.put("Васильев", "Петр");
        tmp.put("Макеев", "Евгений");
        tmp.put("Александров", "Роман");
        tmp.put("Васильев", "Евгений");
        tmp.put("Матвеева", "Светлана");
        tmp.put("Васильева", "Светлана");
        tmp.put("Лисицина", "Наталья");
        tmp.put("Александрова", "Кристина");
        tmp.put("Иванова", "Любовь");
        return tmp;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
