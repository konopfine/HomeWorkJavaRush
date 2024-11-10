package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader; // Импортируем класс BufferedReader для чтения данных с клавиатуры
import java.io.IOException; // Импортируем класс IOException для обработки возможных ошибок ввода-вывода
import java.io.InputStreamReader; // Импортируем класс InputStreamReader для преобразования байтов в символы
import java.util.ArrayList; // Импортируем класс ArrayList для работы со списками

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Solution
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>(); // Создаем статический список для хранения объектов Cat

    public static void main(String[] args) throws IOException // Основной метод, в котором происходит ввод и вывод данных
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для чтения данных с клавиатуры

        while (true) // Запускаем бесконечный цикл для ввода данных
        {
            String name = reader.readLine(); // Считываем имя кота
            if (name.isEmpty()){ // Проверяем, если строка пустая
                break; // Прерываем цикл, если строка пустая
            }
            int age = Integer.parseInt(reader.readLine()); // Считываем и преобразуем возраст кота в число
            int weight = Integer.parseInt(reader.readLine()); // Считываем и преобразуем вес кота в число
            int tailLength = Integer.parseInt(reader.readLine()); // Считываем и преобразуем длину хвоста кота в число
            Cat cat = new Cat(name, age, weight, tailLength); // Создаем объект Cat с введенными данными
            CATS.add(cat); // Добавляем созданный объект в список CATS
        }

        printList(); // Вызываем метод для вывода списка котов на экран
    }

    public static void printList() { // Метод для вывода каждого объекта Cat из списка CATS
        for (int i = 0; i < CATS.size(); i++) // Проходим по каждому элементу списка CATS
        {
            System.out.println(CATS.get(i)); // Выводим информацию о коте на экран
        }
    }

    public static class Cat // Вложенный класс Cat для создания объектов-котов
    {
        private String name; // Поле для хранения имени кота
        private int age; // Поле для хранения возраста кота
        private int weight; // Поле для хранения веса кота
        private int tailLength; // Поле для хранения длины хвоста кота

        Cat(String name, int age, int weight, int tailLength) // Конструктор для создания объекта Cat
        {
            this.name = name; // Инициализируем поле name
            this.age = age; // Инициализируем поле age
            this.weight = weight; // Инициализируем поле weight
            this.tailLength = tailLength; // Инициализируем поле tailLength
        }

        @Override
        public String toString() // Переопределение метода toString для вывода информации о коте
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength; // Возвращаем строку с информацией о коте
        }
    }
}
