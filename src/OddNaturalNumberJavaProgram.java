import java.util.Scanner;

public class OddNaturalNumberJavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of term");
        int a=sc.nextInt();
        for(int i=1;i<=a;i=i+2)
        {
            System.out.println("odd natural numbers are :"+i);
        }
    }
}
