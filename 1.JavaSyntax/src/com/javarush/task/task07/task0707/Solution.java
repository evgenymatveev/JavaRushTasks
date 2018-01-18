package com.javarush.task.task07.task0707;

import java.util.ArrayList;/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        list.add("Mum");
        list.add("Dad");
        list.add("Dauther");
        list.add("Son");
        list.add("Uncle");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
