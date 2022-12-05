package com.example;
class employee1
{
    int salary;
    String name;
    public int getsalary()
    {
        return salary;
    }
    public void setsalary(int s)
    {
        salary=s;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    }


}
public class SetAndGetMethodJava
{
    public static void main(String[] args)
    {
        employee1 e=new employee1();
        e.setsalary(50000);
        System.out.println(e.getsalary());
        e.setname("manoj");
        System.out.println(e.getname());

    }

}
