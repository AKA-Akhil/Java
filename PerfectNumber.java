import java.util.*;
class PerfectNumber
{
    int sumOfFactor(int n)
    {
        int i,s=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
                
            }
        }
        return s;
    }

    void isPerfect(int n)
    {
        if(sumOfFactor(n)==n)
            System.out.println(n+" is a Perfect Number");
        else
            System.out.println(n+" is not a Perfect Number");
    }

    void perfectSeries(int n)
    {
        int i;
        System.out.println("Perfect Numbers are ");
        for(i=1;i<=n;i++)
        {
            if(sumOfFactor(i)==i)
                System.out.println(i);
        }
    }

    void perfectNumberBetweenTwoNumbers(int n1,int n2)
    {
        int i;
        System.out.println("Prime Numbers are ");
        for(i=n1;i<=n2;i++)
        {
            if(sumOfFactor(i)==i)
                System.out.println(i);
        }
    }

    void controller()
    {
        Scanner sc=new Scanner(System.in);
        int ch,a,b;
        do
        {
            System.out.println("Menu\n1.Check Perfect Number\n2.Perfect no. Series\n3.Perfect no. Series Between Two Numbers\n4.Exit\nEnter Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a Number ");
                a=sc.nextInt();
                isPerfect(a);
                break;
                case 2:
                System.out.println("Enter the Limit ");
                a=sc.nextInt();
                perfectSeries(a);
                break;
                case 3:
                System.out.println("Enter the Start and End Value ");
                a=sc.nextInt();
                b=sc.nextInt();
                perfectNumberBetweenTwoNumbers(a,b);
                break;
                case 4:
                System.out.println("Thank You ");    
                break;
                default:
                System.out.println("Invalid");
            }
        }while(ch!=4);
    }

    public static void main(String args[])
    {
        PerfectNumber obj=new PerfectNumber();
        obj.controller();
    }
}