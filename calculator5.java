import java.util.*;
class calculator5
{
    public static void main()
    {
        Scanner in =new Scanner (System.in);
        int a,b,c,d,e,f,g,h,i,j;
            System.out.println("Enter your number 1:");
            a=in.nextInt();
            System.out.println("Enter your number 2:");
            b=in.nextInt();
            System.out.println("Enter your number 3:");
            e=in.nextInt();
            System.out.println("Enter your number 4:");
            g=in.nextInt();
            System.out.println("Enter your number 4:");
            j=in.nextInt();
            System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+a+","+b);
            c=in.nextInt();
            System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+b+","+e);
            f=in.nextInt();
            System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+e+","+g);
            h=in.nextInt();
            System.out.println("Enter which sign you want to put[1 for + ,2 for - ,3 for * ,4 for /] Which is between"+g+","+j);
            i=in.nextInt();
            if(c==1&&f==1&&h==1&&i==1)
            {
                d=a+b+e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==1&&f==1&&h==1&&i==2)
            {
                d=a+b+e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==1&&i==3)
            {
                d=a+b+e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==1&&i==4)
            {
                d=a+b+e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==2&&i==1)
            {
                d=a+b+e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==2&&i==2)
            {
                d=a+b+e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==2&&i==3)
            {
                d=a+b+e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==2&&i==4)
            {
                d=a+b+e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==3&&i==1)
            {
                d=a+b+e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==3&&i==2)
            {
                d=a+b+e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==3&&i==3)
            {
                d=a+b+e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==3&&i==4)
            {
                d=a+b+e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==4&&i==1)
            {
                d=a+b+e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==4&&i==2)
            {
                d=a+b+e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==4&&i==3)
            {
                d=a+b+e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==1&&h==4&&i==4)
            {
                d=a+b+e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==1&&i==1)
            {
                d=a+b-e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==1&&i==2)
            {
                d=a+b-e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==1&&i==3)
            {
                d=a+b-e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==1&&i==4)
            {
                d=a+b-e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==2&&i==1)
            {
                d=a+b-e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==2&&i==2)
            {
                d=a+b-e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==2&&i==3)
            {
                d=a+b-e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==2&&h==2&&i==4)
            {
                d=a+b-e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==1&&i==1)
            {
                d=a+b*e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==1&&f==3&&h==1&&i==2)
            {
                d=a+b*e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==1&&i==3)
            {
                d=a+b*e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==1&&i==4)
            {
                d=a+b*e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==2&&i==1)
            {
                d=a+b*e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==2&&i==2)
            {
                d=a+b*e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==2&&i==3)
            {
                d=a+b*e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==2&&i==4)
            {
                d=a+b*e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==3&&i==1)
            {
                d=a+b*e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==3&&i==2)
            {
                d=a+b*e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==3&&i==3)
            {
                d=a+b*e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==3&&h==3&&i==4)
            {
                d=a+b*e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==1&&i==1)
            {
                d=a+b/e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==1&&i==2)
            {
                d=a+b/e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==1&&i==3)
            {
                d=a+b/e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==1&&i==4)
            {
                d=a+b/e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==2&&i==1)
            {
                d=a+b/e-g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==1&&f==4&&h==2&&i==2)
            {
                d=a+b/e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==2&&i==3)
            {
                d=a+b/e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==2&&i==4)
            {
                d=a+b/e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==3&&i==1)
            {
                d=a+b/e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==3&&i==2)
            {
                d=a+b/e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==3&&i==3)
            {
                d=a+b/e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==3&&i==4)
            {
                d=a+b/e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==4&&i==1)
            {
                d=a+b/e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==4&&i==2)
            {
                d=a+b/e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==4&&i==3)
            {
                d=a+b/e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==1&&f==4&&h==4&&i==4)
            {
                d=a+b/e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==1&&i==1)
            {
                d=a-b+e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==2&&f==1&&h==1&&i==2)
            {
                d=a-b+e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==1&&i==3)
            {
                d=a-b+e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==1&&i==4)
            {
                d=a-b+e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==2&&i==1)
            {
                d=a-b+e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==2&&i==2)
            {
                d=a-b+e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==2&&i==3)
            {
                d=a-b+e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==2&&i==4)
            {
                d=a-b+e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==3&&i==1)
            {
                d=a-b+e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==3&&i==2)
            {
                d=a-b+e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==3&&i==3)
            {
                d=a-b+e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==3&&i==4)
            {
                d=a-b+e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==4&&i==1)
            {
                d=a-b+e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==4&&i==2)
            {
                d=a-b+e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==4&&i==3)
            {
                d=a-b+e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==1&&h==4&&i==4)
            {
                d=a-b+e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==1&&i==1)
            {
                d=a-b-e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==1&&i==2)
            {
                d=a-b-e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==1&&i==3)
            {
                d=a-b-e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==1&&i==4)
            {
                d=a-b-e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==2&&i==1)
            {
                d=a-b-e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==2&&i==2)
            {
                d=a-b-e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==2&&i==3)
            {
                d=a-b-e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==2&&h==2&&i==4)
            {
                d=a+b-e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==1&&i==1)
            {
                d=a-b*e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==2&&f==3&&h==1&&i==2)
            {
                d=a-b*e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==1&&i==3)
            {
                d=a-+b*e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==1&&i==4)
            {
                d=a-b*e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==2&&i==1)
            {
                d=a-b*e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==2&&i==2)
            {
                d=a-b*e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==2&&i==3)
            {
                d=a-b*e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==2&&i==4)
            {
                d=a-b*e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==3&&i==1)
            {
                d=a-b*e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==3&&i==2)
            {
                d=a-b*e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==3&&i==3)
            {
                d=a-b*e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==3&&h==3&&i==4)
            {
                d=a-b*e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==1&&i==1)
            {
                d=a-b/e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==1&&i==2)
            {
                d=a-b/e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==1&&i==3)
            {
                d=a-b/e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==1&&i==4)
            {
                d=a-b/e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==2&&i==1)
            {
                d=a-b/e-g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==2&&f==4&&h==2&&i==2)
            {
                d=a+b/e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==2&&i==3)
            {
                d=a-b/e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==2&&i==4)
            {
                d=a-b/e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==3&&i==1)
            {
                d=a-b/e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==3&&i==2)
            {
                d=a-b/e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==3&&i==3)
            {
                d=a-b/e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==3&&i==4)
            {
                d=a-b/e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==4&&i==1)
            {
                d=a-b/e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==4&&i==2)
            {
                d=a-b/e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==4&&i==3)
            {
                d=a-b/e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==2&&f==4&&h==4&&i==4)
            {
                d=a-b/e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==1&&i==1)
            {
                d=a*b+e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==3&&f==1&&h==1&&i==2)
            {
                d=a*b+e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==1&&i==3)
            {
                d=a*b+e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==1&&i==4)
            {
                d=a*b+e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==2&&i==1)
            {
                d=a+b+e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==2&&i==2)
            {
                d=a*b+e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==2&&i==3)
            {
                d=a*b+e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==2&&i==4)
            {
                d=a*b+e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==3&&i==1)
            {
                d=a*b+e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==3&&i==2)
            {
                d=a*b+e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==3&&i==3)
            {
                d=a*b+e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==3&&i==4)
            {
                d=a*b+e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==4&&i==1)
            {
                d=a*b+e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==4&&i==2)
            {
                d=a*b+e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==4&&i==3)
            {
                d=a*b+e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==1&&h==4&&i==4)
            {
                d=a*b+e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==1&&i==1)
            {
                d=a*b-e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==1&&i==2)
            {
                d=a*b-e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==1&&i==3)
            {
                d=a*b-e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==1&&i==4)
            {
                d=a*b-e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==2&&i==1)
            {
                d=a*b-e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==2&&i==2)
            {
                d=a*b-e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==2&&i==3)
            {
                d=a*b-e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==2&&h==2&&i==4)
            {
                d=a*b-e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==1&&i==1)
            {
                d=a*b*e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==3&&f==3&&h==1&&i==2)
            {
                d=a*b*e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==1&&i==3)
            {
                d=a*b*e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==1&&i==4)
            {
                d=a*b*e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==2&&i==1)
            {
                d=a*b*e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==2&&i==2)
            {
                d=a*b*e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==2&&i==3)
            {
                d=a*b*e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==2&&i==4)
            {
                d=a*b*e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==3&&i==1)
            {
                d=a*b*e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==3&&i==2)
            {
                d=a*b*e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==3&&i==3)
            {
                d=a*b*e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==3&&h==3&&i==4)
            {
                d=a*b*e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==1&&i==1)
            {
                d=a*b/e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==1&&i==2)
            {
                d=a*b/e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==1&&i==3)
            {
                d=a*b/e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==1&&i==4)
            {
                d=a*b/e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==2&&i==1)//...............................
            {
                d=a*b/e-g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==3&&f==4&&h==2&&i==2)
            {
                d=a*b/e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==2&&i==3)
            {
                d=a*b/e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==2&&i==4)
            {
                d=a*b/e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==3&&i==1)
            {
                d=a*b/e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==3&&i==2)
            {
                d=a*e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==3&&i==3)
            {
                d=a*b/e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==3&&i==4)
            {
                d=a*b/e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==4&&i==1)
            {
                d=a*b/e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==4&&i==2)
            {
                d=a*b/e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==4&&i==3)
            {
                d=a*b/e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==3&&f==4&&h==4&&i==4)
            {
                d=a*b/e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==1&&i==1)
            {
                d=a/b+e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==4&&f==1&&h==1&&i==2)
            {
                d=a/b+e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==1&&i==3)
            {
                d=a+b+e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==1&&i==4)
            {
                d=a/b+e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==2&&i==1)
            {
                d=a/b+e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==2&&i==2)
            {
                d=a/b+e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==2&&i==3)
            {
                d=a/b+e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==2&&i==4)
            {
                d=a+b+e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==3&&i==1)
            {
                d=a/b+e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==3&&i==2)
            {
                d=a/b+e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==3&&i==3)
            {
                d=a/b+e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==3&&i==4)
            {
                d=a/b+e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==4&&i==1)
            {
                d=a/b+e/g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==4&&i==2)
            {
                d=a/b+e/g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==4&&i==3)
            {
                d=a/b+e/g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==1&&h==4&&i==4)
            {
                d=a/b+e/g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==1&&i==1)
            {
                d=a/b-e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==1&&i==2)
            {
                d=a/b-e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==1&&i==3)
            {
                d=a/b-e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==1&&i==4)
            {
                d=a/b-e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==2&&i==1)
            {
                d=a/b-e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==2&&i==2)
            {
                d=a/b-e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==2&&i==3)
            {
                d=a/b-e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==2&&h==2&&i==4)
            {
                d=a/b-e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==1&&i==1)
            {
                d=a/+b*e+g+j;
                System.out.println("Your answer is"+d);
            }

            else if(c==41&&f==3&&h==1&&i==2)
            {
                d=a/b*e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==41&&f==3&&h==1&&i==3)
            {
                d=a/b*e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==1&&i==4)
            {
                d=a/b*e+g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==2&&i==1)
            {
                d=a/b*e-g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==2&&i==2)
            {
                d=a/b*e-g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==2&&i==3)
            {
                d=a/b*e-g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==2&&i==4)
            {
                d=a/b*e-g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==3&&i==1)
            {
                d=a/b*e*g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==3&&i==2)
            {
                d=a/b*e*g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==3&&i==3)
            {
                d=a/b*e*g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==3&&h==3&&i==4)
            {
                d=a/b*e*g/j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==4&&h==1&&i==1)
            {
                d=a/b/e+g+j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==4&&h==1&&i==2)
            {
                d=a/ b/e+g-j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==4&&h==1&&i==3)
            {
                d=a/b/e+g*j;
                System.out.println("Your answer is"+d);
            }
            else if(c==4&&f==4&&h==1&&i==4)
            {
                d=a/ b/e+g/j;
                System.out.println("Your answer is"+d);
            }
    }
}