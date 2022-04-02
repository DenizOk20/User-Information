package com.company;
import java.util.Scanner;
public class Job {
    private String Job;




    public String getJob() {
        Scanner job = new Scanner(System.in);
        System.out.print("Enter job:");
        String JobOfUser = job.nextLine();

        return JobOfUser;

    }

    public void setJob(String job) {
        Job = job;
    }


}
