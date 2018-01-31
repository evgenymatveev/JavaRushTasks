package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        } catch (NumberFormatException e) {
            for (Integer s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {

        }

    }
}
