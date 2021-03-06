package ru.itsjava.oop;

public class BritishCat extends Cat {

    public BritishCat() {
        super("британка");
        System.out.println("Я доча - Британская кошка");
    }

    @Override
    public void sayMeow() {
        System.out.println("Mrrrr");
        super.sayMeow();
    }

    public void sayMrr() {
        System.out.println("Mrr");
    }
}
