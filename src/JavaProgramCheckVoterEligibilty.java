import java.util.Scanner;

public class JavaProgramCheckVoterEligibilty
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an age of voter");
        int age=sc.nextInt();
        System.out.println(" print voter age is :"+age);
        if(age>18)
        {
            System.out.println("voter is eligible for voting");

        }
        else{
            System.out.println("voter is not eligible for voting");
        }
    }
}
