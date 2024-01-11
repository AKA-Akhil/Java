import java.util.*;
class calculator2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter your number 1:");
        a=in.nextInt();
        System.out.println("Enter your number 2:");
        b=in.nextInt();
        System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+a+","+b);
        c=in.nextInt();
        if(c==1)
        {
            d=a+b;
            System.out.println("Your answer is"+d);
        }
        else if(c==2)
        {
            d=a-b;
            System.out.println("Your answer is"+d);
        }
        else if(c==3)
        {
            d=a*b;
            System.out.println("Your answer is"+d);
        }
        else if(c==4)
        {
            d=a/b;
            System.out.println("Your answer is"+d);
        }
    }
}