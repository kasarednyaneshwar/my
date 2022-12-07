import java.util.Scanner;

public class JavaProgramMultiplicationTable
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from user");
        int number = sc.nextInt();
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            multiplication = 2 * i;
            System.out.println("multiplication Table of a given Number :" + multiplication);
        }

    }
}
