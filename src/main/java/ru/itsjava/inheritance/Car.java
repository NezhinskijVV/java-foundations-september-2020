package ru.itsjava.inheritance;

public abstract class Car {

    public abstract String getCarMake();

    public void printEmotional() {
        System.out.println("So good seats!");
    }

    public void move(){
        System.out.println("Move from Car");
    }

}

//  interface:              List
//  class:               AbstractSuperList
//  class                AbstractList
//  classes:   ArrayList LinkedList Vector Stack