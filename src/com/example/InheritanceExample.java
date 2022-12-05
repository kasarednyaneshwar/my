package com.example;
class JuniorProfesser1
{
    String designation="teacher";
    String Degree="Bsc(physics)";
    public void teching()
    {
        System.out.println("smart Teaching");
    }
}

class SeniorProfessor1 extends JuniorProfesser1
{
    String mainSubject="physics";
    public void teaching()
    {
        System.out.println(" very smart Teaching");
    }
}


public class InheritanceExample
{

    public static void main(String[] args)
    {
        SeniorProfessor1 m=new SeniorProfessor1();
        m.teching();
        System.out.println(m.designation);
        System.out.println(m.Degree);
        System.out.println( m.mainSubject);
    }

}
