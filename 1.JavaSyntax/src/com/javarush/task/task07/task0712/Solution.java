package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = 0;
        while (n < 10) {
            list.add(reader.readLine());
            n++;
        }
        int max = 0;
        int min = list.get(0).length();
        for (String s : list) {
            if (s.length() > max) {
                max = s.length();
            }
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (String l : list) {
            if (l.length() == max) {
                System.out.println(l);
                break;
            }
            if (l.length() == min) {
                System.out.println(l);
                break;
            }

        }
    }
}
