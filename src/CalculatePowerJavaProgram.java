import java.util.Scanner;

public class CalculatePowerJavaProgram
{
    public static void main(String[] args)
    {
        Scanner one=new Scanner(System.in);
        System.out.println("Enter a user Number");
        int a=one.nextInt();
        System.out.println("Enter a power");
        int p=one.nextInt();
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result=result*a;
        }
        System.out.println("power of given number is :"+result);

    }
}
