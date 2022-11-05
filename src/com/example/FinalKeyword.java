package com.example;
class Pappa
{
    public void car()
    {
        System.out.println("car");
    }
    public void property()
    {
        System.out.println("banglow,Locker");
    }
    public final void medical()
    {
        System.out.println("father like qualify Neet exam");
    }
}
class Son extends Pappa
{
    public void bike()
    {
        System.out.println("Bike");
    }
}
public class FinalKeyword
{
    public static void main(String[] args)
    {
      Son s=new Son();
      s.bike();
      s.car();
      s.property();
      s.medical();


    }
}
