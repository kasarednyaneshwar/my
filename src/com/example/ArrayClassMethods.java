package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethods
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of element you want to store :");
        int n=sc.nextInt();
        System.out.println("Enter an element in arrays");
        int[] a=new int[5];

        System.out.println("user input is:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("print my array element");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        /*1.asList method:
       System.out.println(Arrays.asList(a));*/

        /*2.binarySearch method
        System.out.println("number taken from user");
        int intkey=sc.nextInt();
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,intkey));
        System.out.println("The printed number present at the position:");*/

        /*3.binarySearch(array, fromIndex, toIndex, key, Comparator)
        Arrays.sort(a);
        System.out.println("take one number from user");
        int m=sc.nextInt();
        System.out.println(Arrays.binarySearch(a,1,3,m));*/

        /*compare(array 1, array 2) Method
        System.out.println("how many element of second array you will be store");
        int second=sc.nextInt();
        int[] b=new int[5];
        System.out.println("second array user input is:");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("print user second array element");
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
        System.out.println("see given to array are equal:");
        System.out.println(Arrays.compare(a,b));*///output give if both element is not matching then give -1 and both arrray are equal then give o)

        //4. toString(originalArray) Method
       /* int[] arr1={ 10,20,30,40,50};
        System.out.println(Arrays.toString(arr1));*/

        //5. stream(originalArray) Method
       /* int[] arr1={ 10,20,30,40,50};
        System.out.println(Arrays.stream(arr1));*/

        //6.spliterator(originalArray, fromIndex, endIndex) Method
       /* int[] arr1={ 10,20,30,40,50};
        System.out.println(Arrays.spliterator(arr1));*/

        //7.







    }
}