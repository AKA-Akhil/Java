
public class AI_TicTacToe
{
    public static int main(int playerPos)
    {
         int cpuPos=0;
        if(playerPos==1)
        {
            cpuPos=7;
        }
        else if(playerPos==2)
        {
            cpuPos=3;
        }
        else if(playerPos==3)
        {
            cpuPos=1;
        }
        else if(playerPos==4)
        {
            cpuPos=1;
        }
        else if(playerPos==5)
        {
            cpuPos=6;
        }
        else if(playerPos==6)
        {
            cpuPos=4;
        }
        else if(playerPos==7)
        {
            cpuPos=5;
        }
        else if(playerPos==8)
        {
            cpuPos=5;
        }
        else if(playerPos==9)
        {
            cpuPos=1;
        }
        return cpuPos;
    }
}
