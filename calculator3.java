import java.util.*;
class calculator3
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,c=0,d,e,f,g;
        System.out.println("Enter your number 1:");
        a=in.nextInt();
        System.out.println("Enter your number 2:");
        b=in.nextInt();
        System.out.println("Enter your number 3:");
        e=in.nextInt();
        System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+a+","+b);
        c=in.nextInt();
        System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+b+","+e);
        f=in.nextInt();
        if(c==1&&f==1)
        {
            d=a+b+e;
            System.out.println("Your answer is"+d);
        }

        else if(c==1&&f==2)
        {
            d=a+b-e;
            System.out.println("Your answer is"+d);
        }
        else if(c==1&&f==3)
        {
            d=a+b*e;
            System.out.println("Your answer is"+d);
        }
        else if(c==1&&f==4)
        {
            d=a+b/e;
            System.out.println("Your answer is"+d);
        }
        else if(c==2&&f==1)
        {
            d=a-b+e;
            System.out.println("Your answer is"+d);
        }
        else if(c==2&&f==2)
        {
            d=a-b-e;
            System.out.println("Your answer is"+d);
        }
        else if(c==2&&f==3)
        {
            d=a-b*e;
            System.out.println("Your answer is"+d);
        }
        else if(c==2&&f==4)
        {
            d=a-b/e;
            System.out.println("Your answer is"+d);
        }
        else if(c==3&&f==1)
        {
            d=a*b+e;
            System.out.println("Your answer is"+d);          
        }
        else if(c==3&&f==2)
        {
            d=a*b-e;
            System.out.println("Your answer is"+d);
        }
        else if(c==3&&f==3)
        {
            d=a*b*e;
            System.out.println("Your answer is"+d);
        }
        else if(c==3&&f==4)
        {
            d=a*b/e;
            System.out.println("Your answer is"+d);
        }
        else if(c==4&&f==1)
        {
            d=a/b+e;
            System.out.println("Your answer is"+d);
        }
        else if(c==4&&f==2)
        {
            d=a/b-e;
            System.out.println("Your answer is"+d);
        }
        else if(c==4&&f==3)
        {
            d=a/b*e;
            System.out.println("Your answer is"+d);
        }
        else if(c==4&&f==4)
        {
            d=a/b/e;
            System.out.println("Your answer is"+d);
        }
    }
}