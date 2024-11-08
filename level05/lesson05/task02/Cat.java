package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat // Объявляем класс Cat, представляющий кошку
{
    public String name; // Поле name хранит имя кошки
    public int age; // Поле age хранит возраст кошки
    public int weight; // Поле weight хранит вес кошки
    public int strength; // Поле strength хранит силу кошки

    public Cat() // Конструктор класса Cat (по умолчанию, без параметров)
    {
    }

    public boolean fight(Cat anotherCat) // Метод fight принимает объект anotherCat и определяет победу или поражение в "схватке"
    {
        //напишите тут ваш код
        int ourscore = 0; // Переменная для хранения очков текущей кошки (this)
        int otherscore = 0; // Переменная для хранения очков другой кошки (anotherCat)
        
        // Сравниваем возраст кошек
        if (this.age < anotherCat.age) { // Если текущая кошка младше
            ourscore -= 1; // Уменьшаем очки текущей кошки
            otherscore += 1; // Увеличиваем очки другой кошки
        }
        else if (this.age > anotherCat.age){ // Если текущая кошка старше
            ourscore += 1; // Увеличиваем очки текущей кошки
            otherscore -= 1; // Уменьшаем очки другой кошки
        }

        // Сравниваем вес кошек
        if (this.weight < anotherCat.weight) { // Если текущая кошка легче
            ourscore -= 1; // Уменьшаем очки текущей кошки
            otherscore += 1; // Увеличиваем очки другой кошки
        }
        else if (this.weight > anotherCat.weight){ // Если текущая кошка тяжелее
            ourscore += 1; // Увеличиваем очки текущей кошки
            otherscore -= 1; // Уменьшаем очки другой кошки
        }

        // Сравниваем силу кошек
        if (this.strength < anotherCat.strength) { // Если текущая кошка слабее
            ourscore -= 1; // Уменьшаем очки текущей кошки
            otherscore += 1; // Увеличиваем очки другой кошки
        }
        else if (this.strength > anotherCat.strength){ // Если текущая кошка сильнее
            ourscore += 1; // Увеличиваем очки текущей кошки
            otherscore -= 1; // Уменьшаем очки другой кошки
        }

        // Возвращаем результат боя: true, если текущая кошка победила, иначе false
        return ourscore < otherscore ? false : true;
    }
}

