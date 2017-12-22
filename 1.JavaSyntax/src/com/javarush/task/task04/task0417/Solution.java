package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b && a != c) {
            System.out.println(a + " " + b);
        }
        if (b == c && b != a) {
            System.out.println(b + " " + c);
        }
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}