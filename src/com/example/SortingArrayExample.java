package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size=sc.nextInt();
        int[] arrSize=new int[size];
        int i=0;
        System.out.println("your entered Array element is");
        for(i=0;i<arrSize.length;i++)
        {

            arrSize[i]=sc.nextInt();
        }
        System.out.println("your printed array element");
        for(i=0;i<arrSize.length;i++)
        {

            System.out.print(arrSize[i]+" ");
        }
        System.out.println("");
        System.out.print("Array element after sorting");
        Arrays.sort(arrSize);
        for(i=0;i<arrSize.length;i++)
        {
            System.out.println(Arrays.toString(arrSize));
        }

    }


}
