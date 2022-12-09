//As displayed in the above figure, Programmer is the subclass and Employee is the superclass.
// The relationship between the two classes is Programmer IS-A Employee.
// It means that Programmer is a type of Employee.
class programmer
{
    int salary=40000;
    public void Programmer_salary()
    {
        System.out.println("Programmer Salary");
    }
}
class Employee extends programmer
{
    int salary_Bonus =40000+20000;
    public void Employee_Salary()
    {
        System.out.println("Employee_Salary");
    }
}
public class InheritanceJavaExample
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.Employee_Salary();
        e.Programmer_salary();
        System.out.println(e.salary);
        System.out.println(e.salary_Bonus);




    }
}
