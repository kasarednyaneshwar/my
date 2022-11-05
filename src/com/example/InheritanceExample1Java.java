package com.example;
class JuniorProfesser
{
    String designation="teacher";
    String Degree="Bsc(physics)";
    public void teaching()
    {
        System.out.println("smart Teaching");
    }
}
class SeniorProfessor extends JuniorProfesser
{
    String mainSubject="physics";
    public void teaching()
    {
        System.out.println(" very smart Teaching");
    }
}

public class InheritanceExample1Java
{
    public static void main(String[] args)
    {
        SeniorProfessor s=new SeniorProfessor();
        s.teaching();
        System.out.println(s.designation);
        System.out.println(s.Degree);
        System.out.println(s.mainSubject);
    }

}