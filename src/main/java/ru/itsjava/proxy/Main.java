package ru.itsjava.proxy;

public class Main {

    public static void main(String[] args) {
//        User user = new User("");
//        try {
//            user.setName("Виталий");
//        } catch (IncorrectUserNameException incorrectUserNameException) {
//            incorrectUserNameException.printStackTrace();
//        }

        UserProxy user = new UserProxy("");
        user.setName("Виталий");
    }
}
