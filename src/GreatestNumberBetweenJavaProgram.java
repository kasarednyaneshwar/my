import java.util.Scanner;

public class GreatestNumberBetweenJavaProgram
{
    public static void main(String[] args)
    {
        System.out.println("user first input number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("User Second Input Number ");
        int b=sc.nextInt();
        if(a>b)
        {

            System.out.println("print First Number And Number First is Greatest number");
            System.out.println(a);

        }
        else {

            System.out.println(" Print second Number And Number second is Smallest number  ");
            System.out.println(b);
        }

    }
}
