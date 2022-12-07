import java.util.Scanner;

public class CharacterInputjavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(3);
        System.out.println("print user input character :" +c);

    }
}
