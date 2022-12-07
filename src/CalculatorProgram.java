import java.util.Scanner;

public class CalculatorProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        System.out.println("Enter a user choice");
        int ch=sc.nextInt();

        if(ch==1)
        {
            System.out.println("Addition");
            int sum=a+b;
            System.out.println(sum);

        }
        else if(ch==2)
        {
            System.out.println("subtraction");
            int sub=a-b;
            System.out.println(sub);

        }
        else if(ch==3)
        {
            System.out.println("multiplication");
            int mul=a*b;
            System.out.println(mul);

        }
        else
        {
            System.out.println("Division");
            int Div=a/b;
            System.out.println(Div);

        }


    }
}
