package ru.itsjava.statics;

public class Company {

    public static void main(String[] args) {
        Salary cleanerSalary = new Salary(10_000);
        Salary ceoSalary = new Salary(100_000);

//        Salary.increaseCoefficient = 5;


        System.out.println("cleanerSalary.getFullSalary() = "
                + cleanerSalary.getFullSalary());

        System.out.println("ceoSalary.getFullSalary() = "
                + ceoSalary.getFullSalary());


    }
}
