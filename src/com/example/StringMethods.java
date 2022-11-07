package com.example;

public class StringMethods
{
    public static void main(String[] args)
    {
      String myString="my full name is Dnyaneshwar Dattatray kasare";
      if(myString.contains("kasare"))
      {
          System.out.println("word present in a string");
      }
      else {
          System.out.println("word is not present in aString");
      }
      System.out.println("String in uppercase is :"+myString.toUpperCase());
      System.out.println("String in lowercase is :"+myString.toLowerCase());
      System.out.println("index of character's'in a given String is"+myString.indexOf('p'));
      System.out.println("index of character'm'in a given String is"+myString.indexOf('m'));
      System.out.println("String after substring is :");
    //  String[] word=myString.split(" ");
      System.out.println(myString.substring(9));
      System.out.println(myString.isEmpty());
      String name=" ";
      System.out.println(name.isEmpty());
      String name1="";
      System.out.println(name1.isEmpty());
    }

}
