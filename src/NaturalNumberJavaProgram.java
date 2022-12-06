import java.util.Scanner;

public class NaturalNumberJavaProgram 
{
    public static void main(String[] args)
    {

        System.out.println("Enter a number of term");
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        for(int i = 1; i<=a; i++)
        {
            System.out.println(i);
        }
    }
}
