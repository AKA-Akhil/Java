import java.util.*;

class bubble_sort_int
{
    static void sort()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t;
        System.out.println("Enter 5 numbers");
        for(i=0;i<a.length;i++)
        {         
            a[i]=in.nextInt();
        }

        for(i=a.length-1;i>0;i--)
        {
            for(j=0;j<i;j++)
            {

                if(a[j]>a[j+1])
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