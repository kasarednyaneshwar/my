import java.util.Scanner;

public class JavaProgramToPrintAsciiValue
{
    public static void main(String[] args)
    {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter any user Character");
        char c=m.next().charAt(0);
        System.out.println("print user input character:"+c);
        int a=c;
        System.out.println("ASCII value of a given character is :"+a);
    }
}
