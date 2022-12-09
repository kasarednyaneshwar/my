import java.util.Scanner;

public class SwappingjavaProgram
{
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a first number from user :");
        int number1=r.nextInt();
        System.out.println("print Number getting from user:"+number1);
        System.out.println("Enter a second number from user :");
        int number2=r.nextInt();
        System.out.println("print second Number getting from user:"+number2);
        System.out.println("Print number before swapping :"+number1+" "+number2);
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("print number after Swapping:"+number1+" "+number2);
        System.out.println("Swapping number without using third variable :");
        int a=r.nextInt();
        int b=r.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" After Swapping number :"+a+" "+b);


    }
}
