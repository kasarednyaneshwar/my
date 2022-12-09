public class JavaMethodsExample
{
    public static void main(String[] args)
    {
        Pen1 p=new Pen1();
        p.id=11;
        p.name="sager";
        p.address="pune";
        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.address);
        p.insertRecord(12,"jay","Mumbai");
        p.displayInformation();



    }
}
        class Pen1 {
            int id;
            String name;
            String address;

            public void insertRecord(int id, String name, String address)
            {
                this.id = id;
                this.name=name;
                this.address=address;
            }
            public void displayInformation()
            {
                System.out.println(+id+" "+name+" "+address);
            }
        }


