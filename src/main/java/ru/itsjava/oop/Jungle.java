package ru.itsjava.oop;

public class Jungle {

    public static void main(String[] args) {
        Lion scar = new Lion("Scar");
        scar.printLion();

        scar.setName("Король Шрам");
        scar.printLion();

        System.out.println("В наших джунглях есть: " + scar.getName());
        System.out.println("Количество лап " + scar.getName()
                + ":" + scar.getPawsCount());
    }
}

//HW
//Get + Set на все поля
//Конструкторы от разного числа аргументов
//Внутри terminal или cmd с помощью команд git залит на сервер файл TestGit.java