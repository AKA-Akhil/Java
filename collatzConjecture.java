import java.util.*;
public class collatzConjecture
{
    public static void c1()
    {
        Scanner is=new Scanner(System.in);
        System.out.println("Enter a number!");
        int n1=is.nextInt();
        System.out.print(n1+" ");
        for(int i=1;i>0;i++)
        {
            if(n1==1)
            {
                break;
            }
            else
            {
                if(n1%2==0)
                {
                    n1=n1/2;
                    System.out.print(n1+" ");
                }
                else
                {
                    n1=(3*n1)+1;
                    System.out.print(n1+" ");
                }
            }
        }
        System.out.println();
    }
}