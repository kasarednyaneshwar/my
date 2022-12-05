package com.example;

import java.util.Scanner;

public class ScannerClassJavaExample

    {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a student marks");
            System.out.println("student marks in physics ");
            int a=sc.nextInt();
            System.out.println(a);
            System.out.println("student marks in chemistry ");
            int b=sc.nextInt();
            System.out.println(b);
            System.out.println("student marks in biology ");
            int c=sc.nextInt();
            System.out.println(c);
            System.out.println("average marks in subject");
            double average= (a+b+c)/3;
            System.out.println(average);
            int marks=100;
            if(marks>=40&&a>=33&&b>=33&&c>=33)
            {
                System.out.println("student is pass each subject");
            }
            else
            {
                System.out.println("student is fail in each subject");
            }
        }

    }

