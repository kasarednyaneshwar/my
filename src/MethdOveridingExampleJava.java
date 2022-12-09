//Method overriding:
//in a java Two different class parent class and child classhave same method name and passing a same parameter is called method overriding.
class Vehicle
{
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}
public class MethdOveridingExampleJava extends Vehicle
{
    public void run()
    {
        System.out.println("vehicle is run very fast");
    }
    public static void main(String[] args)
    {
        MethdOveridingExampleJava m= new MethdOveridingExampleJava();
        m.run();

    }
}
