package com.example;
class Grandfather
{
    public void property()
    {
        System.out.println("Gold");
    }

}
class Father extends Grandfather
{
    public void addProperty()
    {
        System.out.println("Car");
    }
}
class Son1 extends Father
{
    public void Add_GrandFather_Father_And_Own_Property()
    {
        System.out.println("Cycle");
    }
}
public class MultilevelInheritanceJavaExample
{

    public static void main(String[] args)
    {
        Son1 s=new Son1();
        s.Add_GrandFather_Father_And_Own_Property();
        s.addProperty();
        s.property();

    }
}