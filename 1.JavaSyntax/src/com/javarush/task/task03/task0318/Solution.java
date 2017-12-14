package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String number = bufferedReader.readLine();
        int n = Integer.parseInt(number);
        System.out.println(name + " " + "захватит мир через " + n + " лет. Му-ха-ха!");
    }
}
