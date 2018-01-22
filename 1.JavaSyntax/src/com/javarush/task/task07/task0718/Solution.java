package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = 0;
        while (n < 10) {
            list.add(reader.readLine());
            n++;
        }

        for (int j = 0; j < list.size() - 1; ) {
            if (list.get(j).length() <= list.get(j + 1).length()) {
                j++;
            } else {
                System.out.println(j + 1);
                break;
            }
        }
    }
}

