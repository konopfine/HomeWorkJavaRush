package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для ввода данных с консоли
        
        // Читаем с консоли имена для всех объектов
        String grandfather = reader.readLine();
        String grandmother = reader.readLine();
        String father = reader.readLine();
        String mother = reader.readLine();
        String son = reader.readLine();
        String daughter = reader.readLine();

        // Создаем объекты класса Cat: дедушку, бабушку, папу, маму, сына и дочь
        Cat grandpa = new Cat(grandfather, null, null); // Дедушка, без отца и матери
        Cat grandma = new Cat(grandmother, null, null); // Бабушка, без отца и матери
        Cat pa = new Cat(father, grandpa, null); // Папа, у которого есть отец-дедушка, но нет матери
        Cat ma = new Cat(mother, null, grandma); // Мама, у которой есть мать-бабушка, но нет отца
        Cat so = new Cat(son, pa, ma); // Сын, у которого есть оба родителя
        Cat da = new Cat(daughter, pa, ma); // Дочь, у которой есть оба родителя

        // Выводим информацию обо всех кошках
        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(so);
        System.out.println(da);
    }

    public static class Cat {
        private String name; // Имя кошки
        private Cat mother; // Мать кошки
        private Cat father; // Отец кошки

        // Конструктор для создания объекта Cat только с именем
        Cat(String name) {
            this.name = name;
        }

        // Конструктор для создания объекта Cat с именем, отцом и матерью
        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() { // Переопределение метода toString для отображения информации о кошке
            if (mother == null && father == null) // Если у кошки нет ни матери, ни отца
                return "Cat name is " + name + ", no mother, no father";
            if (mother == null && father != null) // Если у кошки нет матери, но есть отец
                return "Cat name is " + name + ", no mother, father is " + father.name;
            if (mother != null && father == null) // Если у кошки есть мать, но нет отца
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";

            // Если у кошки есть и мать, и отец
            return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
