package com.example;

public class StringClassMethodsJava
{
    public static void main(String[] args)
    {
        String s="Dnyaneshar";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0));
        System.out.println(s.trim());
        System.out.println(s.substring(0, 3));
        System.out.println(s.replace('r', 'i'));
        System.out.println(s.startsWith("Dn"));
        System.out.println(s.endsWith("ri"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf(2,'a'));
        System.out.println(s.charAt(3));
        System.out.println(s.equals("Dnyaneshar"));

    }
}
