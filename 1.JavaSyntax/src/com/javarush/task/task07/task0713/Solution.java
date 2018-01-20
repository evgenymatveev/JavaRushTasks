package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        ArrayList<Integer> list_3 = new ArrayList<>();

        int n = 0;
        while (n < 20) {
            list.add(Integer.parseInt(reader.readLine()));
            n++;
        }
        for (Integer x : list) {
            if (x % 3 == 0 || (x % 3 == 0 && x % 2 == 0)) {
                list_1.add(x);
            }
            if (x % 2 == 0 || (x % 3 == 0 && x % 2 == 0)) {
                list_2.add(x);
            }
            if (x % 2 != 0 && x % 3 != 0) {
                list_3.add(x);
            }
        }
        printList(list_1);
        printList(list_2);
        printList(list_3);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
