package com.example;
class Grandfather1
{
    public void property()
    {
        System.out.println("Gold");
    }

}
class Father1 extends Grandfather
{
    public void addProperty()
    {
        System.out.println("Car");
    }
}
class Son12 extends Grandfather1
{
    public void Add_GrandFather_Father_And_Own_Property()
    {
        System.out.println("Cycle");
    }
}
public class HierrarichalInheritanceJavaExample
{
    public static void amin(String[] args)
    {

        Father1 f=new  Father1();
        f.addProperty();
        f.property();
        Son12 s=new Son12();
        s.Add_GrandFather_Father_And_Own_Property();
        s.property();



    }
}
