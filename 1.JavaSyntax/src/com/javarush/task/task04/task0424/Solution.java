package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (b != a && b != c && a == c) {
            System.out.println("2");
        }
        if (a != b && a != c && b == c) {
            System.out.println("1");
        }
        if (c != a && c != b && a == b) {
            System.out.println("3");
        }
    }
}
