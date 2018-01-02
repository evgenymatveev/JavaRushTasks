package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                int tmp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = tmp;
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
