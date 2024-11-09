package com.javarush.test.level06.lesson11.home02; // Указываем пакет, в котором находится класс

import java.util.ArrayList; // Импортируем класс ArrayList для работы с динамическими массивами

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat { // Объявляем основной класс Cat

    public Cat() { // Конструктор класса Cat
        cats.add(this); // Добавляем текущий экземпляр кота в статический список cats
    }

    public static ArrayList<Cat> cats = new ArrayList<Cat>(); // Статическая переменная cats, в которой хранятся все объекты Cat

    public static void main(String[] args) { // Главный метод main
        // Создаем 10 объектов Cat
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        printCats(); // Вызываем метод printCats для вывода всех котов на экран
    }

    public static void printCats() { // Метод printCats для вывода всех объектов Cat из списка cats
        for (Cat cat : cats) { // Перебираем каждый объект Cat в списке cats
            System.out.println(cat); // Выводим объект cat на экран (в виде строки по умолчанию)
        }
    }
}
