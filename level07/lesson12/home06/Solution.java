package com.javarush.test.level07.lesson12.home06;

/* Семья
Задача: Создать класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создать объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создаем объекты для двух дедушек, двух бабушек, отца, матери и троих детей
        Human grandfather1 = new Human("grandfather1", true, 87, null, null); // Первый дедушка
        Human grandfather2 = new Human("grandfather2", true, 78, null, null); // Второй дедушка
        Human grandmother1 = new Human("grandmother1", false, 87, null, null); // Первая бабушка
        Human grandmother2 = new Human("grandmother2", false, 78, null, null); // Вторая бабушка
        Human father = new Human("father", true, 30, grandfather1, grandmother1); // Отец
        Human mother = new Human("mother", false, 30, grandfather2, grandmother2); // Мать
        Human child1 = new Human("child1", true, 15, father, mother); // Первый ребенок
        Human child2 = new Human("child2", false, 14, father, mother); // Второй ребенок
        Human child3 = new Human("child3", true, 16, father, mother); // Третий ребенок

        // Выводим все созданные объекты на экран
        System.out.println(grandfather1); // Выводим первого дедушку
        System.out.println(grandfather2); // Выводим второго дедушку
        System.out.println(grandmother1); // Выводим первую бабушку
        System.out.println(grandmother2); // Выводим вторую бабушку
        System.out.println(father); // Выводим отца
        System.out.println(mother); // Выводим мать
        System.out.println(child1); // Выводим первого ребенка
        System.out.println(child2); // Выводим второго ребенка
        System.out.println(child3); // Выводим третьего ребенка
    }

    public static class Human
    {
       public String name; // Имя человека
       public boolean sex; // Пол человека (true - мужской, false - женский)
       public int age; // Возраст человека
       public Human father; // Отец человека
       public Human mother; // Мать человека

        // Конструктор для инициализации объектов класса Human
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name; // Устанавливаем имя
            this.sex = sex; // Устанавливаем пол
            this.age = age; // Устанавливаем возраст
            this.father = father; // Устанавливаем отца
            this.mother = mother; // Устанавливаем мать
        }

        // Переопределенный метод toString для вывода информации о человеке
        public String toString()
        {
            String text = ""; // Строка для вывода
            text += "Имя: " + this.name; // Добавляем имя
            text += ", пол: " + (this.sex ? "мужской" : "женский"); // Добавляем пол
            text += ", возраст: " + this.age; // Добавляем возраст

            // Если есть отец, добавляем его имя
            if (this.father != null)
                text += ", отец: " + this.father.name;

            // Если есть мать, добавляем ее имя
            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text; // Возвращаем строку с информацией о человеке
        }
    }

}
