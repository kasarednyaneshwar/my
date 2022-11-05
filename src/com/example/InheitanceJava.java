package com.example;
class Y
{
    int x;
    String name;

    public Y()
    {
        x=5;
        name="Dnyaneshwar";
    }
    public Y(int c,String n)
    {
        this.x=c;
        this.name=n;
    }
    public void setid(int r)
    {
        this.x=r;
    }
    public int getid()
    {
        return x;
    }
    public Y(String d,int m)
    {
        this.x=m;
        this.name=d;
    }
    public void name()
    {
        System.out.println("name");
    }

}
class Monkey extends Y
{
    int f;
    String name;


    public Monkey()
    {
        int f=5;
        String name="amol";
    }
    public void setid(int g)
    {
        this.f=g;
    }
    public int getid()
    {
        return f;
    }

    public Monkey(int j,String m)
    {
        this.f=j;
        this.name=m;
    }
    public Monkey(String v,int s)
    {
        this.f=s;
        this.name=v;
    }
    public void name()
    {
        System.out.println("hello");
    }

}
public class InheitanceJava
{
    public static void main(String[] args)
    {
        Monkey m=new Monkey();
        m.name();
        m.setid(10);
        System.out.println(m.getid());
        //Y =new Y();
        //Y.setid(5);
        //    System.out.println(Y.getid());
    }
}

