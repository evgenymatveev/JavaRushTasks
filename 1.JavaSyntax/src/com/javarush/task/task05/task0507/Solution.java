package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int number = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n != -1) {
                sum = sum + n;
                number++;
            } else {
                System.out.println((double) sum / number);
                break;
            }
        }
    }
}

