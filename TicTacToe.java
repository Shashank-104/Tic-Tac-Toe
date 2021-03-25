import java.util.*;
import java.io.*;
class TicTacToe
{
    String name1,name2;
    char GAME[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
    void welcome()throws IOException
    {
        for (int i=0;i<9;i++)
        {
            GAME[i]=' ';
        }
        Scanner obj=new Scanner (System.in);
        System.out.print('\u000C');
        System.out.println("Welcome to the game of TIC-TAC-TOE");
        System.out.println("Instructions to play:");
        System.out.println("");
        System.out.println(" 00 | 01 | 02 ");
        System.out.println("____|____|____");
        System.out.println(" 03 | 04 | 05 ");
        System.out.println("____|____|____");
        System.out.println(" 06 | 07 | 08 ");
        System.out.println("    |    |    ");
        System.out.println("Enter the indices of the Box which you want to fill");
        System.out.println("Player 1-Enter your name:");
        name1=obj.nextLine();
        System.out.println("Player 2-Enter your name:");
        name2=obj.nextLine();
        input();
    }
    void input()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Scanner ob=new Scanner(System.in);
        char ch;int a,ind=0;
        for (int i=0;i<9;i++)
        {
            if (i%2==0)
            {
                for(int qj=0;qj<1;qj++)
                {
                    try
                    {
                        System.out.println(name1+", Your Turn");
                        ind=Integer.parseInt(in.readLine());
                        while (GAME[ind]!=' ')
                        {
                            System.out.println("The column is already filled. Re enter your choice");
                            ind=Integer.parseInt(in.readLine());
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException e)
                    { 
                        System.out.println("Wrong input!Enter a number from 0 to 8");
                        qj--;
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Wrong input!Enter a number from 0 to 8");
                        qj--;
                    }
                }
                
                if (GAME[ind]==' ')
                {   
                    GAME[ind]='X';
                }
                System.out.print('\u000C');
            }
            else 
            {
                for (int qj=0;qj<1;qj++)
                {
                    try
                    {
                        System.out.println(name2+", Your Turn");
                        ind=Integer.parseInt(in.readLine());
                        while (GAME[ind]!=' ')
                        {
                            System.out.println("The column is already filled. Re enter your choice");
                            ind=Integer.parseInt(in.readLine());
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException e)
                    { 
                        System.out.println("Wrong input!Enter a number from 0 to 8");
                        qj--;
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Wrong input!Enter a number from 0 to 8");
                        qj--;
                    }
                }
                if (GAME[ind]==' ')
                {   
                    GAME[ind]='O';
                }
                System.out.print('\u000C');
            }
            System.out.println(" "+GAME[0]+"  | "+GAME[1]+"  | "+GAME[2]+" ");
            System.out.println("____|____|____");
            System.out.println(" "+GAME[3]+"  | "+GAME[4]+"  | "+GAME[5]+" ");
            System.out.println("____|____|____");
            System.out.println(" "+GAME[6]+"  | "+GAME[7]+"  | "+GAME[8]+" ");
            System.out.println("    |    |    ");
            a=check();
            if (a==1)
                System.out.println(name1+" Wins!!");
            else if (a==2)
                System.out.println(name2+" Wins!!");  
            if (a==1 || a==2)
            {
                System.out.println("Press Y to Play Again or N to Exit");
                ch=ob.next().charAt(0);
                if (ch=='N' || ch=='n')
                {   
                    System.out.println("Thank you for playing");
                    System.exit(0);
                }
                else if (ch=='Y' || ch=='y')
                {
                    welcome();
                }
            } 
        }
        System.out.println("The game is tied");
        System.out.println("Press Y to Play Again or N to Exit");
        ch=ob.next().charAt(0);
        if (ch=='N' || ch=='n')
           {   
               System.out.println("Thank you for playing");
               System.exit(0);
           }
        else if (ch=='Y' || ch=='y')
           {
                    welcome();
           }
    }
    int check()throws IOException
    {
        for (int i=0;i<=6;i+=3)
        {
            if(GAME[i]==GAME[i+1] && GAME[i+1]==GAME[i+2] && GAME[i]!=' ')
            {
                if (GAME[i]=='X')
                   return 1;
                else 
                   return 2;
            }
        }
        for (int i=0;i<=2;i++)
        {
            if(GAME[i]==GAME[i+3] && GAME[i+3]==GAME[i+6] && GAME[i]!=' ')
            {
                if (GAME[i]=='X')
                   return 1;
                else 
                   return 2;
            }
        }
        if((GAME[0]==GAME[4] && GAME[4]==GAME[8] && GAME[4]!=' ')||(GAME[2]==GAME[4] && GAME[4]==GAME[6] && GAME[4]!=' '))
        {
            if (GAME[4]=='X')
               return 1;
            else 
               return 2;
        }
        return 0;
    }
}