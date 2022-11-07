package com.example;

import java.util.Scanner;

public class StringTrimExampleJava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a student name");
        String name=sc.nextLine();
        System.out.println("enter student RollNumber");
        String rollnumber=sc.nextLine();

        if(name.trim().equalsIgnoreCase("Rahul")&&rollnumber.trim().equalsIgnoreCase("5474"))
        {
            System.out.println(" Welcome:Student id eligible for Login");
        }
        else

        {

            System.out.println("student is not eligible for Login");
        }
        System.out.println("The space between the name string is :"+name.trim().length());
        System.out.println("The space between the rollnumber string is :"+rollnumber.trim().length());
    }

    }

