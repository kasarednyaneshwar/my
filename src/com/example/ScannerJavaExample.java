package com.example;

import java.util.Scanner;

public class ScannerJavaExample
{
    public static void main(String[] args)
    {
        int marks = 100;
        System.out.println("Enter the marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of physics");
        int a= sc.nextInt();
        System.out.println("marks of first student is  " +a);
        System.out.println("enter the marks of chemistry");
        int b=sc.nextInt();
        System.out.println("marks of second student is  " +b);
        System.out.println("enter the marks of biology");
        int c=sc.nextInt();
        System.out.println("marks of third student is  " +c);
        if(marks>40)
        {
            System.out.println("Student is pass in three sunbect");
        }
        else if(marks <33)
        {

            System.out.println("student is fail in each subject");
        }
        else if(marks==33)
        {
            System.out.println("also student is pass each subject");
        }
        System.out.println("best of luck for future");
    }
}
