package com.company;
import  java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Name name = new Name();
        Job job = new Job();
        Scanner answer = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> jobs = new ArrayList<String>();

        int a = 1;
        while(a ==1){
            names.add(name.getName() + "\n");
            jobs.add(job.getJob());
            System.out.print("Print 1 if you add a new user");
            int Answer = answer.nextInt();
            a = Answer;
        }


        System.out.println("Information Of Users:\n");

        for(int i = 0;i<names.size();i++) {

            System.out.print("Name:" + names.get(i) + "Job:" +jobs.get(i));
            System.out.println("\n");
        }






    }
}
