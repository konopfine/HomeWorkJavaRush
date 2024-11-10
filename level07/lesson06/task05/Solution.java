package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для ввода данных с клавиатуры
        ArrayList<String> list = new ArrayList<String>(); // Создаем список строк

        for (int i = 0; i < 5; i++) { // Вводим 5 строк с клавиатуры
            list.add(reader.readLine()); // Добавляем каждую строку в список
        }

        for (int i = 0; i < 13; i++) { // Выполняем операцию 13 раз
            String a = list.get(4); // Получаем последнюю строку списка
            list.remove(4); // Удаляем последнюю строку из списка
            list.add(0, a); // Вставляем эту строку в начало списка
        }

        for (int i = 0; i < list.size(); i++) { // Выводим все строки из списка
            System.out.println(list.get(i)); // Печатаем каждую строку с новой строки
        }
    }
}
