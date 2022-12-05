package com.example;

public class BySimpleMethodsInJava
{
    public static void main(String[]args)
    {
        CellPhone c=new  CellPhone();
        c.ringing();
        c.calling();
        c.sending();
    }
}

    class CellPhone
    {
        public void ringing()
        {
            System.out.println("Ringing");
        }
        public void sending()
        {
            System.out.println("sending");
        }
        public void calling()
        {
            System.out.println("calling");

        }
    }

