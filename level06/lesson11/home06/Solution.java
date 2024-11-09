package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution { // Объявляем основной класс Solution
    public static void main(String[] args) { // Главный метод main, точка входа программы
        System.out.println(KissMyShinyMetalAss.metalAss); // Выводим на экран объект metalAss из класса KissMyShinyMetalAss
    }

    public static class KissMyShinyMetalAss { // Объявляем статический вложенный класс KissMyShinyMetalAss
        static KissMyShinyMetalAss metalAss = new KissMyShinyMetalAss(); // Создаем статический объект metalAss типа KissMyShinyMetalAss
    }
}
