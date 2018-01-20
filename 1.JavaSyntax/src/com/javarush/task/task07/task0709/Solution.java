package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n < 5) {
            strings.add(reader.readLine());
            n++;
        }
        int min = strings.get(0).length();
        for (String sList : strings) {
            if (sList.length() < min) {
                min = sList.length();
            }

        }
        for (String lMin : strings) {
            if (lMin.length() == min) {
                System.out.println(lMin);
            }
        }
    }
}
