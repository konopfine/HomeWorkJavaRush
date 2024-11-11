package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    // Метод для создания словаря с фамилиями и именами
    public static HashMap<String, String> createMap()
    {
        // Создаем новый словарь HashMap
        HashMap<String, String> map = new HashMap<>();
        // Заполняем словарь десятью записями
        map.put("а", "б");
        map.put("б", "р");
        map.put("[", "б");
        map.put("в", "а");
        map.put("]", "а");
        map.put("г", "к");
        map.put("j", "а");
        map.put("т", "н");
        map.put("д", "л");
        map.put("л", "п");
        return map; // Возвращаем заполненный словарь
    }

    // Метод для подсчета людей с совпадающим именем
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0; // Инициализируем счетчик
        // Проходим по значениям словаря (именам)
        for (String key : map.values()) {
            // Если имя совпадает с заданным, увеличиваем счетчик
            if (name.equals(key)) count++;
        }
        return count; // Возвращаем количество совпадений
    }

    // Метод для подсчета людей с совпадающей фамилией
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0; // Инициализируем счетчик
        // Проходим по ключам словаря (фамилиям)
        for (String value : map.keySet()) {
            // Если фамилия совпадает с заданной, увеличиваем счетчик
            if (lastName.equals(value)) count++;
        }
        return count; // Возвращаем количество совпадений
    }
}
