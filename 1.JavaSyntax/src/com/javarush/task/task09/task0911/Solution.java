package com.javarush.task.task09.task0911;

/*
Исключение при работе с коллекциями Map
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
