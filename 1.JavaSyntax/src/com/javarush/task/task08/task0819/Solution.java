package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        it.next();
        it.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> setCat = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            setCat.add(new Cat());
        }
        return setCat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
    }
}
