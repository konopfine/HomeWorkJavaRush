package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader; // Импортируем класс BufferedReader для чтения данных из потока
import java.io.InputStreamReader; // Импортируем класс InputStreamReader для чтения данных из стандартного ввода

public class Solution // Объявляем класс Solution
{
    public static void main(String[] args) throws Exception // Объявляем главный метод main, который может выбросить исключение
    {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем объект reader для чтения текста с клавиатуры
        String name1 = reader.readLine(); // Читаем первую строку из ввода и сохраняем в переменную name1
        String name2 = reader.readLine(); // Читаем вторую строку из ввода и сохраняем в переменную name2
        if (name1.equals(name2)) System.out.println("Имена идентичны"); // Если значения name1 и name2 одинаковы, выводим "Имена идентичны"
        else if (name1.length() == name2.length()) System.out.println("Длины имен равны"); // Иначе, если длины name1 и name2 равны, выводим "Длины имен равны"
    }
}