package ru.itsjava.collection.list.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        System.out.println("stringList.get(0) = " + stringList.get(0));
        stringList.add("second");
        System.out.println("stringList.get(1) = " + stringList.get(1));
        //Вставка элемента before first
        stringList.add(0, "before first");
        System.out.println("stringList.get(0) = " + stringList.get(0));

        System.out.println("stringList.size() = " + stringList.size());
//        stringList.remove("before first");
        stringList.remove(0);
        System.out.println("stringList.get(0) = " + stringList.get(0));
        System.out.println("stringList.isEmpty() = " + stringList.isEmpty());
        stringList.clear();
        System.out.println("after clear: stringList.isEmpty() = "
                + stringList.isEmpty());

        stringList.add("first");
        stringList.add("second");

        System.out.println("stringList.contains(\"first\") = " + stringList.contains("first"));
        System.out.println("stringList.contains(\"third\") = " + stringList.contains("third"));

        stringList.set(1, "last");
        System.out.println("stringList.get(1) = " + stringList.get(1));
        stringList.add("last");

        for (String elem: stringList){
            System.out.print(elem + " ");
        }
        System.out.println();

        stringList.remove("last");

        for (String elem: stringList){
            System.out.print(elem + " ");
        }
        System.out.println();

//        stringList.add(new Object());



    }
}
//Списки:
//0. Содание списков: (Используя конструктор)
//а). Создать пустой список
//б). Создать список размером 20
//
//1. Получить элемент по индексу:
//а). Получить первый элемент
//б). Получить последний элемент
//
//2. Задачи на вставку элемента:
//а) Добавить подряд 5 элементов.
//б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//в) Записать в новый список все элементы предыдущего списка.
//
//3. Задачи на удаление элементов: (Используя методы)
//а) Удалить элемент по значению
//б) Удалить элемент по индексу
//
//4. Проверить наличие элемента
//
//5. Вывод списка:
//а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
//
//6. Отфильтровать список вернуть записи по некоторому условию:
//а) Условие на индекс: Индекс делится на 3
//б) Условие на значение: Вернуть количество элементов, которые равны "***"
//
//7. Пропустить несколько первых элементов
//а) Пропустить первые 3 элемента в списке.
//{
//6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//а) Пропустить первые 2 элемента, которые равные "****"
//{first last second last third last} -> {first second third last}

//8. Вернуть первый подходящий элемент:
//а) Возращаем Первый элемент Делящийся на 3.
//
//9. Возвращаем все элементы удовлетворяющие условию:
//а) Возвращаем все элементы делящиеся на 3
//
//10. Создать класс Person.
//Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н