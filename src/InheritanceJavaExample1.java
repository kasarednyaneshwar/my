class Animal
{
    public void eat()
    {
        System.out.println("All Dogs animals are Eating");

    }
    public void bark()
    {
        System.out.println("All Dogs are bark ");
    }
}
class Dog extends Animal
{
    public void Shouting()
    {
        System.out.println("All Dogs are shout loudly");
    }

}

public class InheritanceJavaExample1
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.bark();
        d.Shouting();


    }
}

