class Animal1
{
    Animal1()
    {
        System.out.println("All Animals are Beautiful");
    }
}
class Dog2 extends Animal1
{
    Dog2()
    {
        super();
        System.out.println("Dog is an Animal");
    }

}
public class SuperKeywordExampleJava
{
    public static void main(String[] args)
    {
        Dog2 d=new Dog2();

    }
}
