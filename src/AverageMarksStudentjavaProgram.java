import java.util.Scanner;

public class AverageMarksStudentjavaProgram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first subject marks");
        int marathi=sc.nextInt();
        System.out.println("print Marathi subject marks:"+marathi);
        System.out.println("enter the second subject marks");
        int English=sc.nextInt();
        System.out.println("print english subject marks:"+English);
        System.out.println("enter the Third subject marks");
        int biology=sc.nextInt();
        System.out.println("print biology subject marks:"+biology);
        System.out.println("enter the fourth second marks");
        int physics=sc.nextInt();
        System.out.println("print physics subject marks:"+physics);
        System.out.println("enter the fifth subject marks");
        int chemistry=sc.nextInt();
        System.out.println("print chemistry subject marks:"+chemistry);

        int TotalMarksObtained = marathi+English+biology+physics+chemistry;
        System.out.println("total marks Obtained :"+TotalMarksObtained);
        double Average_Marks=TotalMarksObtained/5.0;
        System.out.println("Average marks of student is :"+Average_Marks);






    }
}
