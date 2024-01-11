import java.util.*;
class sort
{
    bubble_sort_int bs1=new bubble_sort_int();
    BubbleSort_String bs2=new BubbleSort_String();
    BubbleSort_char bs3=new BubbleSort_char();
    void main()
    {
     Scanner in=new Scanner(System.in);
     System.out.println("Which type of sorting do you want\n1)int\n2)String\n3)char");
     int a=in.nextInt();
     switch(a)
     {
         case 1:
         bs1.sort();
         break;
         
         case 2:
         bs2.sort();
         break;
         
         case 3:
         bs3.main();
         
         default:
         System.out.println("Ivalid choice");
        }
     
    }
}