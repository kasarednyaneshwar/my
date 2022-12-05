package com.example;
class M
{
    int a=10;
}
class B extends M
{
    int a=10;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class VariableExampleJava
{
    public static void main(String[] args)
    {
        B b=new B();
        b.show();

    }

}
