//Covariant Return Type
//The covariant return type specifies that the return type may vary in the same direction as the subclass.
//Before Java5, it was not possible to override any method by changing the return type. But now, since Java5,
// it is possible to override method by changing the return type
class A
{
   A get()
    {
        return this;
    }
}
class B extends A
{
    B get()
    {
        return this;
    }
    void messege()
    {
        System.out.println("covariant Return Type");
    }



}
public class CovariantReturnTypeJavaExample
{
    public static void main(String[] args)
    {
        B b=new B();
        b.messege();
        System.out.println(b.get());

    }
}
