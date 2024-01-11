import java.util.Scanner;
class Calculator
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        calculator2 cal2 =new calculator2();
        calculator3 cal3 =new calculator3();
        calculator4 cal4 =new calculator4();
        calculator5 cal5 =new calculator5();
        int z;
        System.out.println("Enter how many digits you are putting for Eg:-[a+b+c-d   has four digits a,b,c,d] Only upto 5 digits:");
        z=in.nextInt();
        if(z==2)                                          //2 digit
        {
            cal2.main();
        }
        else if(z==3)                                             //3 digit
        {
            cal3.main();
        }
        else if(z==4)                                               //4 digit
        {
            cal4.main();
        }
        else if(z==5)                                               //5 digit
        {
            cal5.main();
        }
        else
        {
            System.out.println("Wrong number selected represnting a digit or a sign");
        }
    }
}

 