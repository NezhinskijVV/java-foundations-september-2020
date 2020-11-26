package ru.itsjava.interfaces;

public class BadGin implements Creatable {

    @Override
    public void createWish() {
        System.out.println("Слушаюсь и повинуюсь! Но я тебя подставил!");
    }
}