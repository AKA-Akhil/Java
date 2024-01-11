import java.util.*;
public class Time_Allotment
{
    public static void timeformat()
    {
        Scanner is=new Scanner(System.in);
        int hrs=0;
        int mins=0;
        int secs=0;
        String answer="";

        System.out.println("Enter how many seconds you want!");
        int n1=is.nextInt();
        if(n1>=0)
        {
            if(n1>=3600)
            {
                hrs=n1/3600;
                secs=n1-(hrs*3600);
                mins=secs/60;
                secs=secs-(mins*60);
            }
            else if(n1<3600)
            {
                hrs=0;
                mins=n1/60;
                secs=n1-(mins*60);
            }
            System.out.println(hrs+":"+mins+":"+secs);
        }
        else
        {
            System.out.println("System:Seconds have to be 0 or positive or the code will bug out!");
        }

    }
}