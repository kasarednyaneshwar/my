class Bank
{
    public int rateOfInterest()
    {
        return 0;
    }

}
class SBI extends Bank
{
    public int rateOfInterest()
    {
        return 8;
    }


}
class Axisbank extends Bank
{
    public int rateOfInterest()
    {
        return 9;
    }
}
public class RealExampleOfMethodOveridingJava
{
    public static void main(String[] args)
{
    SBI s=new SBI();
    System.out.println(s.rateOfInterest());
    Axisbank a=new Axisbank();
    System.out.println(a.rateOfInterest());
}
}
