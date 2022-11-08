package com.example;

public class EmailDomain
{
    public static void main(String[] args)
    {
        String s1="kasarednyaneshwar866@gmail.com";
        String s2="kasarednyaneshwar257@yahoo.com";
         String substring1=s1.substring(21,30);
        System.out.println(substring1);
        String substring2=s2.substring(21,30);
        System.out.println(substring2);
        if(substring1.equals( substring2))

        {
            System.out.println("domain of the both string are same");
        }
        else
        {
        System.out.println("domain of the both the string are not same");
        }
    }

    }

