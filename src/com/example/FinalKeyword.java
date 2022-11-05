package com.example;
final class Pappa
{
    public void car()
    {
        System.out.println("car");
    }
    public void property()
    {
        System.out.println("banglow,Locker");
    }
    public void medical()
    {
        System.out.println("father like qualify Neet exam");
    }
}
class Son
{
    public void bike()
    {
        System.out.println("Bike");
    }
    public void army()
    {
        System.out.println("he like an Indian Army");
    }
}
public class FinalKeyword
{
    public static void main(String[] args)
    {
        final int a=20;
        System.out.println(a);
      Son s=new Son();
      System.out.println("All son Properties");
      s.bike();
      s.army();
      Pappa p=new Pappa();
      System.out.println("All parent Properties");
      p.car();
      p.property();
      p.medical();


    }
}
