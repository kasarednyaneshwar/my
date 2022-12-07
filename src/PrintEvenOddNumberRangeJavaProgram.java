import java.util.Scanner;

public class PrintEvenOddNumberRangeJavaProgram
{
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("enter a range");
        Scanner b=new Scanner(System.in);
        int s=b.nextInt();
        System.out.println("print the user input range :"+s);
        if(s%2==0)
        {
            for(int i=2;i<=s;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("if Range is even then sum of Range is :"+sum);
        }
        else
        {
            for(int i=1;i<=s;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("If Range Is Odd then sum Od Odd range Is :"+sum);
        }

    }
}
