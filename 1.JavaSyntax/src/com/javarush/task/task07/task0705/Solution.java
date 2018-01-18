package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        int[] arr_1 = new int[10];
        int[] arr_2 = new int[10];
        int n = 0;
        while (n < 20) {
            arr[n] = Integer.parseInt(reader.readLine());
            n++;
        }
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                arr_1[i] = arr[i];
            } else {
                arr_2[x] = arr[i];
                x++;
            }
        }
        for (int arr_2N : arr_2) {
            System.out.println(arr_2N);
        }
    }
}
