package org.Programs;

public class MaxMinArray {
    public void maxElement() {
        int a[] = {50, 40, 60, 90, 80, 100, 20, 30, 10};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max number is : " + max);
    }
    public void minElement()
    {
        int a[]={50,40,60,90,80,100,20,30,10};

        int min=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("min number is : "+min);
    }

    public static void main(String[] args) {

         MaxMinArray m=new MaxMinArray();
         m.maxElement();
         m.minElement();
    }
}
