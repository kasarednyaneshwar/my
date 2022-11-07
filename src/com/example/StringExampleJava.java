package com.example;



public class StringExampleJava
{
    public static void main(String[] args)
    {
        String myname=new String("Dnyaneshwar");
      //  String myname1=new String("Dnyaneshwar");
        String myname2=new String("Rahul");
        String myname3=new String("Dnyaneshwar");
       // if(myname2==myname3)
        if(myname.equals(myname3))
        {
            System.out.println("String name is same");
        }
        else {
            System.out.println("String name is not same");
        }
    }
}
