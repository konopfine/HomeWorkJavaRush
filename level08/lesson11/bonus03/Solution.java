package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Создаем объект для чтения данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Создаем массив для хранения 20 слов
        String[] array = new String[20];

        // Заполняем массив словами, введенными с клавиатуры
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        // Сортируем массив в алфавитном порядке
        sort(array);

        // Выводим отсортированный массив на экран
        for (String x : array)
        {
            System.out.println(x);
        }
    }

    // Метод для сортировки массива строк
    public static void sort(String[] array)
    {
        // Сортируем массив с использованием встроенного метода
        Arrays.sort(array);
    }

    // Метод для сравнения строк: возвращает true, если 'a' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
