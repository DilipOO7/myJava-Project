package org.Programs;

public class SecondlargestArray {
    public static void main(String[] args) {
        int a[]={20,50,80,70,90,100,60,40,30,10};
        int temp;
        for(int i=0;i<a.length;i++)
        {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]<a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
        }
        System.out.println(a[1]);
    }
}
