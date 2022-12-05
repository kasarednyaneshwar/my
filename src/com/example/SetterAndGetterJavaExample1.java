package com.example;
class Person
{
    private int student_id;
    private String student_name;
    public void SetStudent_id(int i)
    {
        student_id=i;
    }
    public int getStudent_id()
    {
        return student_id;
    }
    public void SetStudent_name(String n)
    {
        student_name=n;
    }
    public String getStudent_name()
    {
        return student_name;
    }

}
public class SetterAndGetterJavaExample1
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.SetStudent_id (100);
        System.out.println(p.getStudent_id());
        p.SetStudent_name("Dnyaneshwar");
        System.out.println(p.getStudent_name());


    }
}
