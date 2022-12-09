class Adder2
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(int b, double a)
    {
        return a+b;
    }
}
public class MethodOverloadingExample3
{
    public static void main(String[] args)
    {
        Adder1 a=new Adder1();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20.0));

    }
}
