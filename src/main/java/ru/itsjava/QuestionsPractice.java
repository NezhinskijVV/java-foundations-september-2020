package ru.itsjava;

public class QuestionsPractice {
//    private int num = 5;

    public static void main(String[] args) {
        new QuestionsPractice().method1();
    }

    public void method1() {
//        int num = 5;
        int num = 0;
        {
            num = 5;
        }
//
        System.out.println(num);


        if (true) {
            Object obj = new Object();
        }

    }

    public void method2() {
//        num = 6;
    }
}
