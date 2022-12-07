import java.util.Scanner;

public class TaxCalculateProgram
{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Entre a salary");
        int salary = r.nextInt();
        System.out.println("print user input salary:"+salary);
        double tax;
        if (salary <= 10000) {
            System.out.println("tax of 10000 salary is :" + salary );
             System.out.println("No tax of given salary");
        } else if (salary > 10000 && salary <= 100000) {
            tax = salary * 0.10;
            System.out.println("salary of employee  is:"+salary);
            System.out.println("Tax of given salary :"+tax);
        } else {
            tax = salary * 0.20;
            System.out.println("salary of an employee is:" + salary);
            System.out.println("Tax of a given salary:"+tax);
        }
    }
}
