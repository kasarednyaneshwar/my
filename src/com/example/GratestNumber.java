package com.example;



    import java.util.Scanner;

    public class GratestNumber
    {

        public static void main(String[] args)
        {
            System.out.println("Enter a user number");
            Scanner sc=new Scanner (System.in);
            int a=sc.nextInt();
            System.out.println(a);
            System.out.println("my enter number");
            int b=20;
            if(b>a)
            {
                System.out.println("b is a geater number"+ b);
            }
            else

                System.out.println("a is gratest number "+a);



        }

    }

