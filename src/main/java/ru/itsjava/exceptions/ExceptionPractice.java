package ru.itsjava.exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {
//        throw new NullPointerException();

//        try {
//            Object obj = null;
//            obj.toString();
//            throw new RuntimeException();
////            throw new StackOverflowError();
//        } catch (NullPointerException | ArrayIndexOutOfBoundsException npe){
//            System.err.println("У тебя npe");
////            npe.printStackTrace();
//        } catch (Throwable throwable){
//            System.err.println("Я тебя поймал: " + throwable);
//        }
//
//        System.out.println("После обработки ошибки");

//        throw new Exception();

//        try {
//            throw new RuntimeException();
//        } catch (NullPointerException runtimeException) {
//            System.err.println(runtimeException);
//        } finally {
//            System.out.println("FINALLY");
//        }

        User emptyUser = new User("");
//        try {
//            emptyUser.setName(" ");
//        } catch (IncorrectUserNameException incorrectUserNameException) {
//            System.out.println("Некорректное имя");
//            incorrectUserNameException.printStackTrace();
//        }

        emptyUser.setName(" ");
    }
}