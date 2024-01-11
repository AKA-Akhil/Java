import java.util.*;
class Rection_Timer
{
    public static void main() throws InterruptedException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("");
        Thread.sleep(3000);
        System.out.println(3);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(1);
        Thread.sleep(1000);
        System.out.println("GO!!!!!");
        System.out.println("Enter a word");
        long startTime=System.currentTimeMillis();
        String s=in.next();
        long stopTime=System.currentTimeMillis();
        long ReactionTime=(stopTime-startTime)/1000;
        System.out.println(ReactionTime);
        
    }
}