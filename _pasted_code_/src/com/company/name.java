package com.company;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        String var = "Saurabh";

int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>85){
            System.out.println(" ");
        }
        else if(age>55){
            System.out.println("You are semi-experienced!");
        }
        else if(age>15){
            System.out.println("You are semi-semi-experienced!");
        }
        else if(age>5) {
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        }
        }