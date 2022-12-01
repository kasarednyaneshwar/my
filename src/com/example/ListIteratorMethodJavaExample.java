package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorMethodJavaExample
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println(l);
        ListIterator itr=l.listIterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            if(s.equals("a"))
            {
                itr.add("a");
            }
            else if(s.equals("b"))
            {
                itr.add("b");
            }
            else if(s.equals("c"))
            {
                itr.set("m");
            }
            System.out.println(l);
        }
    }
}
