public class inheritancejavaExample3
{
    public static void main(String[] args)
    {
        //create an object of son class
        Son1 s=new Son1();
        s.cycle();
        s.property();
        //create an object of Father class
        Father1 f=new Father1();
        f.Land();
        f.property();


        }
    }

        class GrandFather1
        {
            public void property() {
                System.out.println("Property of GranFather");
            }
        }
        class Father1 extends GrandFather1
        {
            public void Land()
            {
                System.out.println("Father Property");
            }
        }
        class Son1 extends GrandFather1
        {
            public void cycle() {
                System.out.println("Son property");
            }
        }

