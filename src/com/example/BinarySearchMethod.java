package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMethod
{
    public static void main(String[] args)
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element of an array");
        int[] array=new int[5];
        int i=0;
        for( i=0;i<array.length;i++)

        {
            System.out.println("my entered array element is : ");

            array[i]=sc.nextInt();
        }


        for( i=0;i<array.length;i++)
        {
            System.out.println("my printed array element is :");
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        Arrays.sort(array);
        System.out.println("my sorting array element is :" +Arrays.toString(array));
       int[] num = new int[0];
          System.out.println("user input value is :");
          int count=0;
        int intkey=sc.nextInt();
        for(i=0;i<array.length;i++)

       if( array[i]==intkey)
        {
            flag=1;
            break;

        }
        else
       {
           flag=0;
       }
        if(flag==1)
        {
            System.out.println("print user value ");
        }
        else
        {System.out.println("user value is not present" );
        }





    }
}
