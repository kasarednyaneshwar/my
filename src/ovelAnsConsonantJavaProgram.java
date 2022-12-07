import java.util.Scanner;

public class ovelAnsConsonantJavaProgram
{
    public static void main(String[] args)
    {
        System.out.println("Enter any Character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println("User Enter Character is :"+c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("user input Character is Vowel");
        }
        else {
            System.out.println("user input character is consonant");
        }


    }
}
