
//Method overloading;
//if a class multiple methods with same name but passing a different parameter mean (different no of argument,sequence of argument,tye of argument)
//Method overloading(passing different no of argument)
class Adder
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
public class MethodOveloadingJavaExample1
{
    public static void main(String[] args)
    {
        Adder a=new Adder();
        System.out.println(a.add(11,21));
        System.out.println(a.add(12,13,14));

    }
}
