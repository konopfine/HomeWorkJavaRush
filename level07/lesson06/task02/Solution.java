package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для чтения с клавиатуры
        ArrayList<String> list = new ArrayList<String>(); // Создаем список строк для хранения 5 строк
        ArrayList<String> list1 = new ArrayList<String>(); // Создаем список для хранения самых длинных строк

        for (int i = 0; i < 5; i++) { // Цикл для ввода 5 строк с клавиатуры
            list.add(reader.readLine()); // Читаем строку и добавляем в список list
        }

        int length = 0; // Переменная для хранения максимальной длины строки
        for (String s : list) { // Цикл для поиска максимальной длины строки
            if (length < s.length()) { // Если текущая строка длиннее найденной ранее
                length = s.length(); // Обновляем значение максимальной длины
            }
        }

        for (String s : list) { // Цикл для нахождения всех строк с максимальной длиной
            if (length == s.length()) { // Если длина строки равна максимальной
                list1.add(s); // Добавляем строку в список list1
            }
        }

        for (int i = 0; i < list1.size(); i++) { // Цикл для вывода строк из списка list1
            System.out.println(list1.get(i)); // Выводим каждую длинную строку с новой строки
        }
    }
}
