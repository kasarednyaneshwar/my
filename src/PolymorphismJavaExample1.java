/*      Polymorphism in Java
        Polymorphism in Java is a concept by which we can perform a single action in different ways.
        Polymorphism is derived from 2 Greek words: poly and morphs.
        The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
        There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.
        If you overload a static method in Java, it is the example of compile time polymorphism.
        Here, we will focus on runtime polymorphism in java. */

//RunTimePolyMorphism in java.
class Animal5
{
    public void run()
    {
        System.out.println("All animals are very fast");
    }
}
class Cow extends Animal5
{
    public void run()
    {
        System.out.println("Cow is an Animal");
    }
}
public class PolymorphismJavaExample1
{
    public static void main(String[] args)
    {
        Animal5 a=new Cow();//upcasting
        a.run();

    }
}
