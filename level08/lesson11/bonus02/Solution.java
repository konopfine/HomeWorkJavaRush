package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // Создаем объект для чтения данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Создаем словарь для хранения пар "город - фамилия"
        HashMap<String, String> map = new HashMap<String, String>();

        // Чтение данных и заполнение словаря
        while (true)
        {
            // Чтение названия города
            String city = reader.readLine();
            // Если введена пустая строка, выходим из цикла
            if (city.isEmpty()) break;
            // Чтение фамилии семьи
            String person = reader.readLine();
            // Добавление пары "город - фамилия" в словарь
            map.put(city, person);
        }

        // Чтение названия города для поиска семьи
        String city = reader.readLine();
        // Вывод фамилии семьи, соответствующей введенному городу
        System.out.println(map.get(city));
    }
}
