package com.company;
import java.util.Scanner;
public class Salary {
    private int Salary;



    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int salaryInformation(){

        Scanner salary = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salaryInformation = salary.nextInt();

        return salaryInformation;
    }
}
