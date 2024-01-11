import java.util.*;
class BubbleSort_String
{
    static void sort()
     {
       Scanner in=new Scanner(System.in);   
       String a[]=new String[5],t;
       int i,j;
       System.out.println("Enter 5 names");
       for(i=0;i<a.length;i++)
        {
         a[i]=in.next();
         }
       for(i=a.length-1;i>0;i--)     
        {
          for(j=0;j<i;j++)
          {

              if(a[j].compareToIgnoreCase(a[j+1])>0)
              {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
                 }
             }
         }
        
       for(i=0;i<a.length;i++)
        {         
            System.out.println(a[i]);
         }
    }
}