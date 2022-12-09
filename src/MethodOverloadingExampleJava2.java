//Method overloading by changing datatype
class Adder1
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}
public class MethodOverloadingExampleJava2
{
    public static void main(String[] args)
    {
        Adder1 a=new Adder1();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10.0,20.0));

    }
}
