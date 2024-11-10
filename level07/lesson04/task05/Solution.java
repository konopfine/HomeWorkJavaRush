package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20]; // Создаем массив на 20 чисел
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем объект для ввода с клавиатуры

        for (int i = 0; i < numbers.length; i++) { // Цикл для ввода 20 чисел с клавиатуры
            numbers[i] = Integer.parseInt(reader.readLine()); // Считываем число и сохраняем его в массив
        }

        int[] numbers1 = new int[10]; // Создаем первый массив на 10 чисел

        for (int i = 0; i < numbers.length / 2; i++) { // Цикл для копирования первой половины большого массива в первый маленький
            numbers1[i] = numbers[i]; // Копируем элементы в numbers1
        }

        int[] numbers2 = new int[10]; // Создаем второй массив на 10 чисел

        for (int a = numbers.length / 2, i = 0; a < numbers.length; i++, a++) { // Цикл для копирования второй половины большого массива во второй маленький
            numbers2[i] = numbers[a]; // Копируем элементы в numbers2
        }

        for (int i = 0; i < numbers2.length; i++) { // Цикл для вывода второго маленького массива на экран
            System.out.println(numbers2[i]); // Выводим каждое значение с новой строки
        }
    }
}
