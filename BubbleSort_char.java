import java.util.*;
class BubbleSort_char
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        char a[]=new char[5],t;
        int i,j;
        System.out.println("Enter 5 letters");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.next().charAt(0);
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