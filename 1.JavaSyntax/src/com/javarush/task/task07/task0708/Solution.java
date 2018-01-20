package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n < 5) {
            strings.add(reader.readLine());
            n++;
        }
        int max = 0;
        for (String sList : strings) {
            if (sList.length() > max) {
                max = sList.length();
            }

        }
        for (String lMax : strings) {
            if (lMax.length() == max) {
                System.out.println(lMax);
            }
        }
    }
}
