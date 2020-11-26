package ru.itsjava.interfaces;

public class InterfacePractice {

    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();
//        khotabich.canFly();  <- ошибка компиляции (раннее связывание)

        Creatable badGin = new BadGin();
        badGin.createWish();

        System.out.println("Creatable.LIFE = " + Creatable.LIFE);
    }
}

//Main App app = new App(new MySqlJdbc());
// App  ---->   Dao <-  MySqlJdbc , OracleJdbc, MongoDbJdbc
// class App{
//
//  Dao dao;
//  public App(Dao dao){
//   this.dao = dao}
//

//  Person misha = dao.findByName("Миша");
//}
