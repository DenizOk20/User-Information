package com.company;

import java.util.Scanner;

public class Name {

    private String Name;



    public String getName() {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter name and surname:");
        String UserName = name.nextLine();

        return UserName;

    }

    public void setName(String name) {

        Name = name;
    }

}
