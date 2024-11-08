package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution { // Объявляем основной класс Solution
    public static void main(String[] args) { // Главный метод main, точка входа программы
        //напишите тут ваш код
        Cat cat1 = new Cat("a", 2, 23, 12); // Создаем объект cat1 с именем "a", возрастом 2, весом 23 и силой 12
        Cat cat2 = new Cat("b", 3, 24, 11); // Создаем объект cat2 с именем "b", возрастом 3, весом 24 и силой 11
        Cat cat3 = new Cat("c", 4, 22, 14); // Создаем объект cat3 с именем "c", возрастом 4, весом 22 и силой 14

        // Определяем победителя в битве между cat1 и cat2
        if (cat1.fight(cat2)) { // Если cat1 побеждает cat2
            System.out.println(cat1.name + " победил"); // Выводим, что cat1 победил
        }
        else System.out.println(cat2.name + " победил"); // Иначе выводим, что cat2 победил

        // Определяем победителя в битве между cat2 и cat3
        if (cat2.fight(cat3)) { // Если cat2 побеждает cat3
            System.out.println(cat2.name + " победил"); // Выводим, что cat2 победил
        }
        else System.out.println(cat3.name + " победил"); // Иначе выводим, что cat3 победил

        // Определяем победителя в битве между cat3 и cat1
        if (cat3.fight(cat1)) { // Если cat3 побеждает cat1
            System.out.println(cat3.name + " победил"); // Выводим, что cat3 победил
        }
        else System.out.println(cat1.name + " победил"); // Иначе выводим, что cat1 победил
    }

    public static class Cat { // Вложенный класс Cat, представляющий объект "Кот"
        public static int count = 0; // Статическое поле count для подсчета созданных объектов Cat
        public static int fightCount = 0; // Статическое поле fightCount для подсчета сражений между объектами Cat

        protected String name; // Поле name для хранения имени кота
        protected int age; // Поле age для хранения возраста кота
        protected int weight; // Поле weight для хранения веса кота
        protected int strength; // Поле strength для хранения силы кота

        public Cat(String name, int age, int weight, int strength) { // Конструктор класса Cat с параметрами
            count++; // Увеличиваем счетчик count при создании нового объекта Cat

            this.name = name; // Инициализируем поле name
            this.age = age; // Инициализируем поле age
            this.weight = weight; // Инициализируем поле weight
            this.strength = strength; // Инициализируем поле strength
        }

        public boolean fight(Cat anotherCat) { // Метод fight для определения победителя в битве между текущим котом и другим котом
            fightCount++; // Увеличиваем счетчик fightCount при каждом вызове метода fight

            int agePlus = this.age > anotherCat.age ? 1 : 0; // agePlus равно 1, если текущий кот старше другого, иначе 0
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0; // weightPlus равно 1, если текущий кот тяжелее другого, иначе 0
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0; // strengthPlus равно 1, если текущий кот сильнее другого, иначе 0

            int score = agePlus + weightPlus + strengthPlus; // Подсчитываем общий счет, складывая agePlus, weightPlus и strengthPlus
            return score > 2; // Возвращаем true, если счет больше 2 (то есть текущий кот побеждает), иначе false
        }
    }
}
