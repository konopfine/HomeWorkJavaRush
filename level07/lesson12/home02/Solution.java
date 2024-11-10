package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader; // Импортируем класс BufferedReader для чтения данных с клавиатуры
import java.io.IOException; // Импортируем класс IOException для обработки ошибок ввода/вывода
import java.io.InputStreamReader; // Импортируем класс InputStreamReader для преобразования байтов в символы
import java.util.ArrayList; // Импортируем класс ArrayList для работы со списками
import java.util.Iterator; // Импортируем класс Iterator для итерации по спискам

/* Переставить M первых строк в конец списка
Задача: Ввести с клавиатуры 2 числа N и M. Ввести N строк и заполнить ими список. Переставить M первых строк в конец списка. Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для чтения ввода с клавиатуры

        int N = Integer.parseInt(reader.readLine()); // Считываем количество строк N
        int M = Integer.parseInt(reader.readLine()); // Считываем количество строк M для перестановки

        ArrayList<String> list = new ArrayList<>(); // Создаем список для хранения N строк
        for (int i = 0; i < N; i++) { // Заполняем список строками
            list.add(reader.readLine());
        }

        ArrayList<String> copy = new ArrayList<>(list); // Создаем копию списка для дальнейшей работы

        for (int i = 0; i < M; i++) { // Перемещаем первые M строк в конец списка
            list.add(copy.get(i));
        }

        Iterator<String> iterator = list.iterator(); // Создаем итератор для списка
        int i = 0; // Счетчик для определения, когда переставить строки
        while (iterator.hasNext()) { // Итерируем по списку
            String a = iterator.next(); // Получаем очередной элемент
            iterator.remove(); // Удаляем его из списка
            i++; // Увеличиваем счетчик
            if (i == M) break; // Прерываем цикл, как только переставили первые M строк
        }

        for (String a : list) { // Выводим содержимое списка на экран
            System.out.println(a);
        }
    }
}
