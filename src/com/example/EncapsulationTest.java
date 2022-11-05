package com.example;

import java.net.StandardSocketOptions;
import java.util.Scanner;

class MyInfo
{
    private String name;
    private int age;
    public void setName(String name)
    {
        if(name.length()>15)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter valid name");
            name=sc.nextLine();
            System.out.println("After valid printName is :");
            System.out.println(name);


        }


        this.name=name;

    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        if(age>21)
        {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a eligible student age");
            age=sc.nextInt();
            System.out.println("student is  eligible for college voting");




        }
        {
            this.age = age;
        }
    }
    public int getAge()
    {
        return age;
    }

}
public class EncapsulationTest
{
    public static void main(String[] args)
    {
     MyInfo m=new MyInfo();
   //  m.setName("sager");
  //   System.out.println(m.getName());
     m.setAge(22);
     System.out.println(m.getAge());
   //  System.out.println("student is not eligible for voting");

    }
}




