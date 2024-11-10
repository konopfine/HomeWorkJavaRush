package com.javarush.test.level07.lesson09.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для ввода данных с клавиатуры

        ArrayList<Integer> list = new ArrayList<Integer>(); // Основной список для хранения 20 введенных чисел

        for (int i = 0; i < 20; i++) { // Чтение 20 чисел с клавиатуры
            list.add(Integer.parseInt(reader.readLine())); // Преобразование строки в число и добавление в список
        }

        ArrayList<Integer> even = new ArrayList<Integer>(); // Список для чисел, делящихся на 2
        ArrayList<Integer> odd = new ArrayList<Integer>(); // Список для чисел, делящихся на 3
        ArrayList<Integer> others = new ArrayList<Integer>(); // Список для всех остальных чисел

        for (int i = 0; i < list.size(); i++) { // Перебор всех чисел из основного списка
            Integer x = list.get(i); // Получаем текущее число из списка

            if (x % 2 == 0) // Если число делится на 2
                even.add(x); // Добавляем его в список even

            if (x % 3 == 0) // Если число делится на 3
                odd.add(x); // Добавляем его в список odd

            if (x % 2 != 0 && x % 3 != 0) // Если число не делится на 2 и не делится на 3
                others.add(x); // Добавляем его в список others
        }

        printList(odd); // Выводим на экран список чисел, делящихся на 3
        printList(even); // Выводим на экран список чисел, делящихся на 2
        printList(others); // Выводим на экран список всех остальных чисел
    }

    public static void printList(List<Integer> list) { // Метод для вывода всех элементов списка
        for (int i = 0; i < list.size(); i++) { // Проходим по всем элементам списка
            System.out.println(list.get(i)); // Печатаем каждый элемент с новой строки
        }
    }
}
