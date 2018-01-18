package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int n = 0;
        while (n < 10) {
            arr[n] = Integer.parseInt(reader.readLine());
            n++;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        for (int arrN : arr) {
            System.out.println(arrN);
        }

    }
}

