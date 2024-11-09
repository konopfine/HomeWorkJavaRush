package com.javarush.test.level06.lesson11.home04;

/* Минимальное количество static-ов
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась
*/

public class Solution { // Объявляем основной класс Solution
    public static int step; // Статическая переменная step, отслеживающая количество вызовов метода

    public static void main(String[] args) { // Статический метод main, точка входа программы
        method1(); // Вызываем метод method1
    }

    public static void method1() { // Статический метод method1, вызывает следующий метод
        method2(); // Вызываем method2
    }

    public static void method2() { // Статический метод method2, создает объект Solution и вызывает method3
        new Solution().method3(); // Создаем новый экземпляр Solution и вызываем его метод method3
    }

    public void method3() { // Обычный метод (нестатический) method3, вызывает method4
        method4(); // Вызываем method4
    }

    public void method4() { // Обычный метод method4, увеличивает значение step и выводит стек вызовов
        step++; // Увеличиваем значение переменной step на 1
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) // Проходим по элементам стека вызовов
            System.out.println(element); // Выводим каждый элемент стека вызовов на экран

        if (step > 1) return; // Если step больше 1, завершаем метод
        main(null); // В противном случае вызываем main еще раз (рекурсия)
    }
}
