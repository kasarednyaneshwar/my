import java.util.Scanner;

public class OddEvenNumberJavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a one number from user");
        int number=sc.nextInt();
        System.out.println(" print User input number is:"+number);
        if(number%2==0)
        {
            System.out.println("Given number is even number");
        }
        else
        {
         System.out.println("Given number is odd number");
        }
    }
}
