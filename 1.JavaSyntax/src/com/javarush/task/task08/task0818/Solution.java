package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 300);
        map.put("Васильев", 550);
        map.put("Макеев", 200);
        map.put("Александров", 600);
        map.put("Ковалевский", 900);
        map.put("Матвеева", 150);
        map.put("Васильева", 250);
        map.put("Лисицина", 700);
        map.put("Александрова", 800);
        map.put("Иванова", 250);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator <HashMap.Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if(it.next().getValue() < 500) {
                    it.remove();
                }
            }
    }

    public static void main(String[] args) {

    }
}