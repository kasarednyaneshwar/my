import java.util.Scanner;

public class ThreeGreatestNumberjavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First Number");
        int a=sc.nextInt();
        System.out.println("Enter a second Number");
        int b=sc.nextInt();
        System.out.println("Enter a Third Number");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("The Greatest number is:"+a);
            }
            else {
                System.out.println("The Smallest number is"+c);
            }

        }
        else
        {
            if(b>c)
            {
                System.out.println("The greatest number is :"+b);
            }
            else {
                System.out.println("The Smallest Number is :"+c);
            }
        }


    }
}
