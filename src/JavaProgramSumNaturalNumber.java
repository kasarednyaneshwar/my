import java.util.Scanner;

public class JavaProgramSumNaturalNumber
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a number To Calculate sum");
        int b=r.nextInt();
        System.out.println("input give from the user is:"+b);
        for(int i=0;i<=b;i++)
        {
             sum=sum+i;

        }
        System.out.println("user required sum is:"+sum);
    }
}
