package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {

    public static void main(String[] args) {
        System.out.println();
//        File file = new File("my-file.txt");
//        File file = new File("/Users/vitaliynezhinskiy/IdeaProjects" +
//                "/java-foundations-september-2020" +
//                "/java-foundations-september-2020/src/main/resources/my-file.txt");
        //относительный путь !
        File file = new File("src/main/resources/my-file.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Privet");
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

//        BufferedReader fileReader = null;
//        try {
//            fileReader =
//                    new BufferedReader(new FileReader(file));
//            System.out.println(fileReader.readLine());
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        } finally {
//            try {
//                fileReader.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

        //try with resources (AutoClosable)
        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(file))) {
            System.out.println(fileReader.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }




    }
}
