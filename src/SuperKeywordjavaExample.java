//super keyword
//java super keyword referred to object of super class.
//by using super keyword we calculate super class constructor,variable method through sub_class object
//java super keyword referred super class instance variable.
class Animal2
{
    String colour="White";
}
class Dog1 extends Animal2
{
    String colour="Black";
    public void setColour()
    {
      System.out.println(this.colour);
      System.out.println(super.colour);
    }
}
public class SuperKeywordjavaExample
{
    public static void main(String[] args)
    {
        Dog1 d=new Dog1();
        d.setColour();
    }
}
