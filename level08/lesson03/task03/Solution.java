package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Массив строк с именами котов
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        // Создаем коллекцию HashMap, содержащую имена котов в качестве ключей и объекты Cat в качестве значений
        HashMap<String, Cat> map = addCatsToMap(cats);

        // Выводим элементы коллекции на экран, каждый элемент с новой строки
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    // Метод для добавления котов в коллекцию HashMap
    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        // Создаем новую коллекцию HashMap
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        
        // Заполняем коллекцию котами, используя имя в качестве ключа
        for (int i = 0; i < cats.length; i++)
        {
            map.put(cats[i], new Cat(cats[i]));
        }
        
        return map; // Возвращаем заполненную коллекцию
    }

    // Класс Cat с полем имя (name)
    public static class Cat
    {
        String name;

        // Конструктор класса Cat для инициализации поля name
        public Cat(String name)
        {
            this.name = name;
        }

        // Переопределение метода toString для вывода имени кота в верхнем регистре
        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
