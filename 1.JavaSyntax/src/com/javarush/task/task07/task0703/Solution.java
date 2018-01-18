package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr_1 = new String[10];
        int[] arr_2 = new int[10];
        int n = 0;
        while (n < 10) {
            arr_1[n] = reader.readLine();
            arr_2[n] = arr_1[n].length();
            n++;
        }
        for (int anArr_2 : arr_2) {
            System.out.println(anArr_2);
        }
    }
}
