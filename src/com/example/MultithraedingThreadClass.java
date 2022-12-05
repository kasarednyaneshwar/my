package com.example;
class MyThread extends Thread
{
   public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("child Thread");
        }
    }
}
public class MultithraedingThreadClass
{
    public static void main(String[] args)
    {
        MyThread t=new MyThread();
        t.start();
        //t.run();//perform normal java method and run Thread is not build in these method.
        for(int i=0;i<4;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
