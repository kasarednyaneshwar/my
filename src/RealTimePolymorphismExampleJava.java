class ReserveBankOfIndia
{
    public int getRateOfInterest()
    {
        return 1;
    }
}
class SBI1 extends ReserveBankOfIndia
{
    public int getRateOfInterest()
    {
        return 8;
    }

}
class CentralBankOfIndia extends ReserveBankOfIndia
{
    public int getRateOfInterest()
    {
        return 9;
    }
}


public class RealTimePolymorphismExampleJava
{
    public static void main(String[] args)
    {
        ReserveBankOfIndia r=new SBI1();
        System.out.println(r.getRateOfInterest());
        ReserveBankOfIndia r1=new  CentralBankOfIndia();
        System.out.println(r1.getRateOfInterest());


    }
}
