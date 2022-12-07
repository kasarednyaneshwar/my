import java.util.Scanner;

public class PrintAlphabatesJavaprogram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        char i=sc.next().charAt(0);
        for( i='A';i<='Z';i++)
        {
            System.out.println("print all alphabets in Ascending order :"+i);
        }
        for( i='Z';i>='A';i--)
        {
            System.out.println("print all alphabets in Descending order :"+i);
        }
    }
}
