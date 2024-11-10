package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader; // Импортируем класс BufferedReader для чтения данных с клавиатуры
import java.io.IOException; // Импортируем класс IOException для обработки возможных ошибок ввода-вывода
import java.io.InputStreamReader; // Импортируем класс InputStreamReader для преобразования байтов в символы
import java.util.ArrayList; // Импортируем класс ArrayList для работы со списками

/* Нужно заменить функциональность программы
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается. Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем BufferedReader для чтения данных с клавиатуры

        ArrayList<String> list = new ArrayList<String>(); // Создаем список для хранения введенных строк
        while (true) // Запускаем бесконечный цикл для ввода данных
        {
            String s = reader.readLine(); // Считываем строку
            if (s.isEmpty()) break; // Прерываем цикл, если строка пустая
            list.add(s); // Добавляем строку в список
        }

        ArrayList<String> listUpperCase = new ArrayList<String>(); // Создаем новый список для хранения обработанных строк
        for (int i = 0; i < list.size(); i++) // Проходим по каждому элементу списка
        {
            String s = list.get(i); // Получаем строку из исходного списка
            if (s.length() % 2 == 0) { // Проверяем, если длина строки четная
                listUpperCase.add(s + " " + s); // Удваиваем строку и добавляем в новый список
            }
            else { // Если длина строки нечетная
                listUpperCase.add(s + " " + s + " " + s); // Утраиваем строку и добавляем в новый список
            }
        }

        for (int i = 0; i < listUpperCase.size(); i++) // Проходим по новому списку
        {
            System.out.println(listUpperCase.get(i)); // Выводим каждую строку из нового списка на экран
        }
    }
}
