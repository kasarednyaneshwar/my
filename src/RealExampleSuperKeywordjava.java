class Person4
{
    int id;
    String name;
    Person4(int id,String name)
    {
     this.id=id;
     this.name=name;
    }
}
class Emp extends Person4
{
    float salary;
    Emp(int id,String name,float salary)
    {
        super(id,name);
        this.salary=salary;
    }
    void displyInformation()
    {
        System.out.println(+id+"  "+name+"  "+salary);
    }
}
public class RealExampleSuperKeywordjava
{
    public static void main(String[] args)
    {
        Emp e=new Emp(1,"Keshav",25000);
        e.displyInformation();
    }
}
