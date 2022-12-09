import java.util.Scanner;

public class AreaOfTrianglejava
{
    public static void main(String[] args)
    {
        //calculate Area ot Rectangle:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length of Rectangle");
        int l=sc.nextInt();
        System.out.println("print Length of Rectangle is : "+l);
        System.out.println("Enter a Breadth of Rectangle");
        int b=sc.nextInt();
        System.out.println("print breadth of Rectangle is : "+b);
        int RectangleArea=l*b;
        System.out.println("Required Area Of Rectangle is :"+RectangleArea);
        //calculate Area of Triangle:
        double AreaOfTriangle=0.5*l*b;
        System.out.println("Area of Triangle is:"+AreaOfTriangle);
        //calculate Area of circle:
        System.out.println("Enter a radius of circle :");
        int r=sc.nextInt();
        double AreaCircle=3.14*r*r;
        System.out.println("Area of circle is :"+AreaCircle);
        //calculate circumference of circle
        double circumference=2*3.14*r;
        System.out.println("Circumference of circle is :"+ circumference);
        System.out.println("Enter a side of square :");
        int side=sc.nextInt();
        System.out.println("Print side of square:"+side);
        int AreaSquare=side*side;
        System.out.println("Area of side is :"+AreaSquare);

    }
}
