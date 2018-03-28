package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                if (name.isEmpty()) {
                    map.put(name, id);
                    break;
                }
                map.put(name, id);
            }
        } catch (NumberFormatException e) {

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String index = pair.getKey();
            int name = pair.getValue();
            System.out.println(name + " " + index);
        }
    }
}
