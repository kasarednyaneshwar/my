package com.example;

import java.util.Scanner;

public class switchStatement
{



        public static void main(String[] args)
        {
            System.out.println("enter the name of the friend");
            Scanner sc=new Scanner(System.in);
            String FriendName=sc.nextLine();
            switch(FriendName)
            {
                case "dnyaneshwar":System.out.println("he is very honest");
                   break;
                case "yogesh":System.out.println("he is a software Tester");
                    break;
                case "Amol":System.out.println("he is a software engineer");
                    break;
                case "kashinath":System.out.println("he is a Developer");
                    break;
                default :System.out.println("all the guys are working in IT industry very honestly");

            }
            System.out.println("Everyone are better future in next days");

        }

    }

