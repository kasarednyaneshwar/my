import java.util.Scanner;

public class UserInputAddTwoNumberJavaProgram
{
    public static void main(String[] args)
    {
        System.out.println("Enter a first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        System.out.println(b);
        int sum=a+b;
        System.out.println("sum of the number is");
        System.out.println(sum);


    }
}
