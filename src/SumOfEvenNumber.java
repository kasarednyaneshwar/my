import java.util.Scanner;

public class SumOfEvenNumber
{
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("Enter a number of term");
        Scanner s=new Scanner(System.in);
         int m=s.nextInt();
        System.out.println("Print Number of term from user :"+m);
        for(int i=1;i<=m;i++)
        {
            System.out.println("print firsr m natural number :"+i);
        }
        for(int i=2;i<=m;i=i+2)
    {
        sum=sum+i;

    }
        System.out.println("user required Even number sum is:"+sum);
}
}
