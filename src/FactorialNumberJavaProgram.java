import java.util.Scanner;

public class FactorialNumberJavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user input number");
        int a=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=a;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of a given number:"+factorial);
    }
}
