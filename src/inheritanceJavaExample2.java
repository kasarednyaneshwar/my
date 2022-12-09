
class GrandFather
{
    public void property() {
        System.out.println("Property of GranFather");
    }
}
class Father extends GrandFather
{
    public void Land()
    {
        System.out.println("Father Property");
    }
}
class Son extends Father
{
    public void cycle() {
        System.out.println("Son property");
    }
}
public class inheritanceJavaExample2
{
    public static void main(String[] args)
    {
        System.out.println("create object of Son class");
       Son s=new Son();
       s.cycle();
       s.Land();
       s.property();
       System.out.println("create an object of Father class");
       Father f=new Father();
       f.Land();
       f.property();
       System.out.println("Create an object of GrandFather class");
       GrandFather g=new GrandFather();
       g.property();
    }
}

