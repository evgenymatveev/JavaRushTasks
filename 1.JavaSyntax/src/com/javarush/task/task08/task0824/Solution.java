package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human daughter = new Human("Kristina", 16, false);
        Human son1 = new Human("Kris", 20, true);
        Human son2 = new Human("Vlad", 6, true);
        Human father = new Human("Evgen", 40, true, daughter, son1, son2);
        Human mother = new Human("Svetlana", 35, false, daughter, son1, son2);
        Human grandFather = new Human("Victor", 75, true, mother);
        Human grandMother = new Human("ludmila", 70, false, mother);
        Human grandFather2 = new Human("Sasha", 75, true, father);
        Human grandMother2 = new Human("Nina", 70, false, father);
        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(son1);
        System.out.println(son2);
    }

    public static class Human {
        public String name;
        public int age;
        public boolean sex;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human... children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.addAll(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
