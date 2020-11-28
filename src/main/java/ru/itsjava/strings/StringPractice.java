package ru.itsjava.strings;

public class StringPractice {

    public static void main(String[] args) {
        String str = "Я замечательная строка!";

        str = str.substring(1);

        System.out.println(str);


        String name = "Vitaliy";
        String nameCopy = "Vitaliy";
        String constrName = new String("Vitaliy");
        String internName = constrName.intern();

        System.out.println("(name == nameCopy) = " + (name == nameCopy));
        System.out.println("(name == constrName) = " + (name == constrName));


        System.out.println("(name == internName) = " + (name == internName));

        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            str = str + "1";
//        }
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append(1);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        System.out.println(stringBuilder.toString());
    }
}

//1. Дополнительные методы в классах с дз фигурами:
//Фигуру сделать абстрактной
//        - double getArea() либо void printArea()
//        - double getPerimeter() void printPerimeter() //(зависит от того, что реализовали)
//        - методы toString() для каждой фигуры
//        - метод equals для треугольников, который возвращает true, если площади равны
//        - метод equals для прямоугольника, который возвращает true, если периметры равны
//        - добавить констунту PI
//        - добавить класс круг
//        2. Создать интерфейсы Talkable и Eatable
//        - реализовать default метода в этих интерфейсах talk() и eat()
//        - классы Cow, Man, Plant (растение) и реализовать эти интерфейсы

//BufferedReader