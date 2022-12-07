import java.util.Scanner;

public class ountDigitsJavaProgram
{
    public static void mainI(String[] args)
    {
        int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user input number");
        int a=sc.nextInt();
        while(a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println("number of digits in given number is :"+count);
    }
}
