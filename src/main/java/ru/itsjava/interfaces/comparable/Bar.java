package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class Bar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle waterBottle = new Bottle("plastic", 0.5);
        Bottle whiskeyBottle = new Bottle("glass", 0.7);
        Bottle colaBottle = new Bottle("plastic", 1.5);

        System.out.println("waterBottle.compareTo(whiskeyBottle) = " + waterBottle.compareTo(whiskeyBottle));

        Bottle[] bottles = {colaBottle, waterBottle, whiskeyBottle};
        System.out.println("Before sorting: " + Arrays.toString(bottles));

        Arrays.sort(bottles);

        System.out.println("After sorting: " + Arrays.toString(bottles));

        System.out.println("waterBottle.clone() = " + waterBottle.clone());
    }
}

//INTERFACE pt1
//1. Создать следующие интерфейсы:
//- Walkable с методом void walk()
//- Swimable с методами void swim(), double maxSwimSpeed()
//- Runnable с методами void run(), int maxRunDistance()
//- Flyable с методами void fly() и String sing()
//2. Создать классы: Man (человек), Dog, Cat, Bird, Fish и реализовать соответствующие интерфейсы
//
// 3. Создать Класс Vodka (4 поля)
//- Перегрузить метод void drinkTooMuch()
//- Перегрузить конструкторы


//1. Создать класс Person ( Поля: Имя, Фамилия и возраст)
//2. Реализовать интерфейс Comparable.
// Реализовать метод compareTo(), который будет сравнивать человека по фамилии, если фамилии одинаковые, то по имени, в ином случае по возрасту.
//3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.
//4. В классе Person реализовать метод clone()

//табличка по ооп (до субботы)

