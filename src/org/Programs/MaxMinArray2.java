package org.Programs;

public class MaxMinArray2 {

    public void max()
    {
       int a[]={15,65,89,90,500,300,200};
       int max=Integer.MIN_VALUE;
       for(int element:a)
       {
           if(element>max)
           {
               max=element;
           }
       }
        System.out.println(max);
    }
    public void min()
    {
        int a[]={15,65,89,90,500,300,200};
        int min=Integer.MAX_VALUE;
        for(int element:a)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        MaxMinArray2 m=new MaxMinArray2();
        m.max();
        m.min();
    }
}
