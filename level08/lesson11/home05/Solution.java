package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // Читаем строку текста с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        // Разделяем строку на массив строк по пробелам
        String[] space = s.split(" ");
        
        // Массив для хранения символов каждого слова
        char chars[];

        // Проходим по каждому слову
        for (int i = 0; i < space.length; i++) {
            chars = space[i].toCharArray(); // Преобразуем слово в массив символов

            // Проверяем, что слово не пустое
            if (chars.length == 0) continue;

            // Заменяем первый символ слова на заглавный
            space[i] = space[i].replaceFirst(String.valueOf(chars[0]), String.valueOf(Character.toUpperCase(chars[0])));
        }

        // Выводим строку с заглавными первыми буквами
        for (String a : space) {
            System.out.print(a + " ");
        }
    }
}
