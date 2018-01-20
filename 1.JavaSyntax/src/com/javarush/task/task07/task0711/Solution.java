package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n < 5) {
            list.add(reader.readLine());
            n++;
        }
        for (int i = 0; i < 13; i++) {
            String s = list.get(list.size() - 1);
            list.remove(list.get(list.size() - 1));
            list.add(0, s);
        }
        for (String l : list) {
            System.out.println(l);
        }
    }
}
