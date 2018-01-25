package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h = new Human("Evgen", true, 40);
        Human h1 = new Human("Slava", true, 35);
        Human h2 = new Human("Masha", true, 34);
        Human h3 = new Human("Sveta", true, 20);

        Human h4 = new Human("Dasha", true, 20, h2, h);
        Human h5 = new Human("Kolia", true, 50, h3, h1);
        Human h6 = new Human("Kristina", true, 45, h3, h);
        Human h7 = new Human("Valera", true, 67, h2, h);
        Human h8 = new Human("Gosha", true, 87, h3, h1);

        System.out.println(h);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















