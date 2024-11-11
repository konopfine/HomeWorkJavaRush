package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    // Метод для создания словаря с фамилиями и именами
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("а", "а");
        map.put("б", "а");
        map.put("в", "б");
        map.put("г", "в");
        map.put("д", "в");
        map.put("е", "г");
        map.put("ж", "г");
        map.put("з", "г");
        map.put("и", "д");
        map.put("й", "е");
        return map; // Возвращаем заполненный словарь
    }

    // Метод для удаления людей, имеющих одинаковые имена
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        // Список для хранения дублирующихся имен
        ArrayList<String> duplicates = new ArrayList<>();
        int count = 0;
        
        // Подсчитываем количество одинаковых имен
        for (String value : map.values()) {
            for (String value2 : map.values()) {
                if (value.equals(value2)) count++;
            }
            if (count > 1) duplicates.add(value); // Добавляем имя в список дубликатов, если оно встречается более одного раза
            count = 0;
        }
        
        // Убираем повторы из списка дубликатов
        Set<String> uniqueDuplicates = new HashSet<>(duplicates);
        
        // Создаем копию исходного словаря, чтобы избежать ConcurrentModificationException
        HashMap<String, String> copy = new HashMap<>(map);
        
        // Удаляем записи из оригинального словаря, если их значение совпадает с дублирующимся именем
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (uniqueDuplicates.contains(pair.getValue())) {
                map.remove(pair.getKey());
            }
        }
    }

    // Метод для удаления из словаря всех записей с заданным значением
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<>(map); // Создаем копию словаря
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey()); // Удаляем запись, если значение совпадает с заданным
            }
        }
    }
}
