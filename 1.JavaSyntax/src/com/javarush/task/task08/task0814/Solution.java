package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(45);
        set.add(2);
        set.add(76);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(89);
        set.add(9);
        set.add(12);
        set.add(34);
        set.add(21);
        set.add(10);
        set.add(11);
        set.add(98);
        set.add(345);
        set.add(123);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if(it.next() > 10) {
                it.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
