package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int n = 0;
        int even = 0;
        int odd = 0;
        while (n < arr.length) {
            arr[n] = Integer.parseInt(reader.readLine());
            n++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i % 2 == 0) {
                even = even + arr[i];
            } else {
                odd = odd + arr[i];
            }
        }
        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
