package com.example;
class Man
{
    int x;
    Man(int m)
    {
        this.x=m;
        System.out.println("Constructor Method");
    }

}
public class JavaVariableExample
{
    public static void main(String[] args)
    {
        Man m=new Man(5);
         m.x=5;

    }
}
