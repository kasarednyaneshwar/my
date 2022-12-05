package com.example;
class parent
{
    void bike()
    {
        System.out.println("bike");
    }
}
class child extends parent
{
    void cycle()
    {
        System.out.println("cycle");
    }
}
public class singlelevelinheritance
{
    public static void main(String[] agrs)
    {
        child c=new child();
        c.bike();
        c.cycle();

    }

}
