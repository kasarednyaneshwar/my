package com.example;

import java.util.Scanner;

public class StringExample
{
    public static  void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a username");
    String username=sc.nextLine();
   // String username="kasarednyaneshwar866@gmail.com";
    System.out.println("Enter a password");
    String password=sc.nextLine();
  //  String password="ksaree123*";
    System.out.println("length of username is : "+username.length());
    System.out.println("length of password is : "+password.length());
    if(username.equalsIgnoreCase("kasarednyaneshwar866@gmail.com")&&password.equalsIgnoreCase("kasare123*"))
    {
        System.out.println("welcome : your username and password is correct");
    }
    else
    {
        System.out.println("user can't enter a page with wrong username and password");

    }
}

}
