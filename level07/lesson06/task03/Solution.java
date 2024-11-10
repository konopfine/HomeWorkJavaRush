package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для ввода данных с клавиатуры
        ArrayList<String> list = new ArrayList<String>(); // Создаем список для хранения строк

        for (int i = 0; i < 5; i++) { // Цикл для ввода 5 строк с клавиатуры
            list.add(reader.readLine()); // Читаем строку и добавляем ее в список
        }

        int length = list.get(0).length(); // Инициализируем переменную длины минимальной строки первой строкой списка

        for (String a : list) { // Цикл для нахождения минимальной длины строки
            if (length > a.length()) { // Если текущая строка короче найденной ранее
                length = a.length(); // Обновляем значение минимальной длины
            }
        }

        for (String a : list) { // Цикл для вывода всех строк с минимальной длиной
            if (length == a.length()) { // Если длина строки равна минимальной
                System.out.println(a); // Выводим строку на экран
            }
        }
    }
}
