package ru.itsjava.inheritance;

public class Main {

    public static void main(String[] args) {
        Car car = new Bmw();
        car.printEmotional();

        Bmw bmw = new Bmw();
        bmw.move();

    }
}
