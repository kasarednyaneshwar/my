package com.example;

import java.util.Scanner;

public class SplitStringMethodJava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String myString="my name is Dnyaneshwar kasare";
        //by using .length() method calculate length of string with space between them
        System.out.println("Length of my string is :"+myString.length());
        //calculate number of words in string
        String[] words=myString.split(" ");
        System.out.println("number of words in a given string is :"+words.length);
        int i=0;
        for(String word:words)
        {
            i++;
            System.out.println("number of character in a given string is :"+word);
        }

    }
}
