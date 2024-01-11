import java.io.*;
import java.util.*;
public class Main_Block
{

    public static void main()throws InterruptedException
    {

        Scanner is=new Scanner(System.in);
        Scanner ts=new Scanner(System.in);
        Time_Allotment time=new Time_Allotment();
        Load_Screen sc=new Load_Screen();
        TicTacToe tic=new TicTacToe();
        Configuration cn=new Configuration();
        Rection_Timer timer=new Rection_Timer();
        date_time times=new date_time();
        Calculator cal=new Calculator();
        Playing_Hand_Cricket_Against_Computer game=new Playing_Hand_Cricket_Against_Computer();
        Cool_Number_Guess_Magic_Trick magic=new Cool_Number_Guess_Magic_Trick();
        collatzConjecture n1=new collatzConjecture();
        PrimeNumbers p1=new PrimeNumbers();
        PerfectNumber p2=new PerfectNumber();
        sort bs=new sort();
        String ans="";
        String ans1="";
        int a=0;
        sc.main();
        do
        {
            System.out.println("\fSystem:Enter the password!");
            String pass=ts.nextLine();
            cn.main();
            do
            {
                if(pass.equals("yoink"))
                {
                    System.out.println("\fOptions stated below:");
                    System.out.println("1.Time allotment");
                    System.out.println("2.Collatz Conjecture");
                    System.out.println("3.Calculator");
                    System.out.println("4.Hand Cricket");
                    System.out.println("5.Guess your no.");
                    System.out.println("6.Current Date & Time");
                    System.out.println("7.Reaction Timer");
                    System.out.println("8.TicTacToe");
                    System.out.println("9.Prime Numbers");
                    System.out.println("10.Perfect Number");
                    System.out.println("11.Sort");
                    System.out.println("12.Exit");
                    a=is.nextInt();
                    if(a==1)
                    {
                        do
                        {
                            System.out.print("\f");
                            time.timeformat();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==2)
                    {
                        do
                        {
                            System.out.print("\f");
                            n1.c1();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==3)
                    {
                        do
                        {
                            System.out.print("\f");
                            cal.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }

                    else if(a==4)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            game.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==5)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            magic.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==6)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            times.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==7)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            timer.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==8)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            tic.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==9)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            p1.controller();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==10)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            p2.controller();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a==11)
                    {
                        do
                        {
                            System.out.print("\f");                            
                            bs.main();
                            System.out.println("System: Do you want to do this again or no?");
                            System.out.println("System: Yes(y) or No(n)");
                            ans=ts.nextLine();
                        }
                        while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                    }
                    else if(a>12 || a<1)
                    {
                        System.out.println("System:Invalid! Shifting to option 1...");
                        System.out.println("System:Do you wish to procede?");
                        System.out.println("System:Yes(y) or No(n)");
                        ans=ts.nextLine();
                        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
                        {
                            do
                            {
                                System.out.print("\f");
                                time.timeformat();
                                System.out.println("System: Do you want to do this again or no?");
                                System.out.println("System: Yes(y) or No(n)");
                                ans=ts.nextLine();
                            }
                            while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                        }
                        else
                        {
                            System.out.println("\fCode finished!");
                            break;
                        }
                    }
                    else if(a==12)
                    {
                        System.out.println("\fDo you wish to proceed?");
                        System.out.println("System: Yes(y) or No(n)");
                        ans=ts.nextLine();
                        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
                        {
                            System.out.println("\fCode finished!");
                            break;
                        }
                        else
                        {
                            do
                            {
                                System.out.print("\f");
                                time.timeformat();
                                System.out.println("System: Do you want to do this again or no?");
                                System.out.println("System: Yes(y) or No(n)");
                                ans=ts.nextLine();
                            }
                            while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
                        }
                    }

                    System.out.println("System:Do you want to return to home screen?");
                    System.out.println("System:Yes(y) or No(n)");
                    ans=ts.nextLine();
                }
                else
                {
                    System.out.println("System:Wrong Password!");
                    System.out.println("System:Do you want to try again?");
                    System.out.println("System:Yes(y) or No(n)");
                    ans1=ts.nextLine();
                }
            }
            while(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"));
            System.out.println("\fCode Finished!");
        }
        while(ans1.equalsIgnoreCase("y") || ans1.equalsIgnoreCase("yes"));
    }

}