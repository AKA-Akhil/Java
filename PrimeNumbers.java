import java.util.*;
class PrimeNumbers
{
    int countFactor(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        return c;
    }

    void isPrime(int n)
    {
        if(countFactor(n)==2)
            System.out.println(n+" is a Prime Number");
        else
            System.out.println(n+" is not a Prime Number");
    }

    void primeSeries(int n)
    {
        int i;
        System.out.println("Prime Numbers are ");
        for(i=2;i<=n;i++)
        {
            if(countFactor(i)==2)
                System.out.println(i);
        }
    }

    void primeBetweenTwoNumbers(int n1,int n2)
    {
        int i;
        System.out.println("Prime Numbers are ");
        for(i=n1;i<=n2;i++)
        {
            if(countFactor(i)==2)
                System.out.println(i);
        }
    }

    void controller()
    {
        Scanner sc=new Scanner(System.in);
        int ch,a,b;
        do
        {
            System.out.println("Menu\n1.Check Prime Number\n2.Prime Series\n3.Prime Series Between Two Numbers\n4.Exit\nEnter Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter a Number ");
                a=sc.nextInt();
                isPrime(a);
                break;
                case 2:
                System.out.println("Enter the Limit ");
                a=sc.nextInt();
                primeSeries(a);
                break;
                case 3:
                System.out.println("Enter the Start and End Value ");
                a=sc.nextInt();
                b=sc.nextInt();
                primeBetweenTwoNumbers(a,b);
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
        PrimeNumbers obj=new PrimeNumbers();
        obj.controller();
    }
}