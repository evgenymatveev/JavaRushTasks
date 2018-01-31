package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> tmpMap = new HashMap<>();
        tmpMap.put("Vasia", new Cat("Vasia"));
        tmpMap.put("Boris", new Cat("Boris"));
        tmpMap.put("Petr", new Cat("Petr"));
        tmpMap.put("Evgen", new Cat("Evgen"));
        tmpMap.put("Slava", new Cat("Slava"));
        tmpMap.put("Nikita", new Cat("Nikita"));
        tmpMap.put("Sasha", new Cat("Sasha"));
        tmpMap.put("Kolia", new Cat("Kolia"));
        tmpMap.put("Alex", new Cat("Alex"));
        tmpMap.put("Misha", new Cat("Misha"));
        return tmpMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> tmpSet = new HashSet<>();
        tmpSet.addAll(map.values());
        return tmpSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
