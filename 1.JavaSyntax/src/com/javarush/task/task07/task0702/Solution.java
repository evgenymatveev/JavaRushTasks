package com.javarush.task.task07.task0702;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        int n = 0;
        while (n < 8) {
            arr[n] = reader.readLine();
            n++;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}