package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader; // Импортируем класс BufferedReader для чтения данных с клавиатуры
import java.io.IOException; // Импортируем класс IOException для обработки ошибок ввода/вывода
import java.io.InputStreamReader; // Импортируем класс InputStreamReader для преобразования байтов в символы

/* Максимальное и минимальное числа в массиве
Задача: Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для ввода данных с клавиатуры

        int maximum = 0; // Инициализируем переменную для хранения максимального числа, начальное значение 0
        int minimum = 0; // Инициализируем переменную для хранения минимального числа, начальное значение 0
        int[] massiv = new int[20]; // Создаем массив размером 20 для хранения чисел

        for (int i = 0; i < massiv.length; i++) { // Заполняем массив чисел с клавиатуры
            massiv[i] = Integer.parseInt(reader.readLine()); // Считываем число и записываем его в массив
        }

        for (int a : massiv) { // Итерируем по массиву для нахождения максимального числа
            if (maximum < a) { // Если текущее число больше текущего максимума
                maximum = a; // Обновляем максимальное число
            }
        }

        minimum = maximum; // Изначально минимальное число равно максимальному, чтобы потом уменьшить его

        for (int a : massiv) { // Итерируем по массиву для нахождения минимального числа
            if (minimum > a) { // Если текущее число меньше текущего минимума
                minimum = a; // Обновляем минимальное число
            }
        }

        System.out.print(maximum + " "); // Выводим максимальное число
        System.out.print(minimum); // Выводим минимальное число
    }
}
