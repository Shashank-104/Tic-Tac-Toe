import java.util.*;
class tic_tac_toe
{
    String p1,p2;int j;
    char a[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
    void welcome()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to TIC TAC TOE !!!");
        System.out.println("player one enter your name");
        p1=in.nextLine();
        System.out.println("player two enter your name");
        p2=in.nextLine();
        System.out.println("Here is the grid pattern:");
        System.out.println("_01_|_02_|_03_");
        System.out.println("_04_|_05_|_06_");
        System.out.println(" 07 | 08 | 09 ");
        
    }
    void working()
    {
        Scanner pv = new Scanner(System.in);
        tic_tac_toe obj = new tic_tac_toe();
        int ctr=0;
        for(int i=1;i<=9;i++)
        {
            if(i%2==1)
            {
                for(int p=0;p<1;p++)
                {
                try
                {
                  System.out.println(p1+",your turn:");
                  j=pv.nextInt();
                  if(a[j-1]==' ')
                  a[j-1]='X';
                  else
                  {
                    while(a[j-1]!=' ')
                    {
                        System.out.println("re-enter the location,its already filled");
                        j=pv.nextInt();
                    }
                    a[j-1]='X';
                  }
                }
                catch(Exception e)
                {
                   if(j>9 || j<=0)
                    System.out.println("this array index does not exist, please enter a number between 1 and 9");
                    else
                    System.out.println("you've entered a non-integral value,please enter an integer");
                    p--;
                }
                }
                if(a[0]!=' ' && a[1]!=' ' && a[2]!=' ' && a[0]=='X'&& a[1]=='X' && a[2]=='X')
                ctr=1;
                else if(a[3]!=' ' && a[4]!=' ' && a[5]!=' ' && a[3]=='X' && a[4]=='X'&& a[5]=='X')
                ctr=1;
                else if(a[6]!=' ' && a[7]!=' ' && a[8]!=' ' && a[6]=='X' && a[7]=='X'&& a[8]=='X')
                ctr=1;
                else if(a[0]!=' ' && a[3]!=' ' && a[6]!=' ' && a[0]=='X' && a[3]=='X'&& a[6]=='X')
                ctr=1;
                else if(a[1]!=' ' && a[4]!=' ' && a[7]!=' ' && a[1]=='X' && a[4]=='X'&& a[7]=='X')
                ctr=1;
                else if(a[2]!=' ' && a[5]!=' ' && a[8]!=' ' && a[2]=='X' && a[5]=='X'&& a[8]=='X')
                ctr=1;
                else if(a[0]!=' ' && a[4]!=' ' && a[8]!=' ' && a[0]=='X' && a[4]=='X'&& a[8]=='X')
                ctr=1;
                else if(a[2]!=' ' && a[4]!=' ' && a[6]!=' ' && a[2]=='X' && a[4]=='X'&& a[6]=='X')
                ctr=1;
                System.out.print('\u000C');
                System.out.println("_"+a[0]+"_|_"+a[1]+"_|_"+a[2]+"_");
                System.out.println("_"+a[3]+"_|_"+a[4]+"_|_"+a[5]+"_");
                System.out.println(" "+a[6]+" | "+a[7]+" | "+a[8]+" ");
            }
            else
            {
                for(int p=0;p<1;p++)
                {
                    try
                    {
                      System.out.println(p2+",your turn:");
                      int k=pv.nextInt();
                      if(a[k-1]==' ')
                      a[k-1]='O';
                      else
                      {
                        while(a[k-1]!=' ')
                        {
                          System.out.println("re-enter the location,its already filled");
                          k=pv.nextInt();
                        }
                        a[k-1]='O';
                      }
                    }
                    catch(Exception e)
                    {
                       if(j>9 || j<=0)
                        System.out.println("this array index does not exist, please enter a number between 1 and 9");
                       else
                        System.out.println("you've entered a non-integral value,please enter an integer");
                       p--;
                    }
                }
                if(a[0]!=' ' && a[1]!=' ' && a[2]!=' ' && a[0]=='O'&& a[1]=='O' && a[2]=='O')
                ctr=2;
                else if(a[3]!=' ' && a[4]!=' ' && a[5]!=' ' && a[3]=='O' && a[4]=='O'&& a[5]=='O')
                ctr=2;
                else if(a[6]!=' ' && a[7]!=' ' && a[8]!=' ' && a[6]=='O' && a[7]=='O'&& a[8]=='O')
                ctr=2;
                else if(a[0]!=' ' && a[3]!=' ' && a[6]!=' ' && a[0]=='O' && a[3]=='O'&& a[6]=='O')
                ctr=2;
                else if(a[1]!=' ' && a[4]!=' ' && a[7]!=' ' && a[1]=='O' && a[4]=='O'&& a[7]=='O')
                ctr=2;
                else if(a[2]!=' ' && a[5]!=' ' && a[8]!=' ' && a[2]=='O' && a[5]=='O'&& a[8]=='O')
                ctr=2;
                else if(a[0]!=' ' && a[4]!=' ' && a[8]!=' ' && a[0]=='O' && a[4]=='O'&& a[8]=='O')
                ctr=2;
                else if(a[2]!=' ' && a[4]!=' ' && a[6]!=' ' && a[2]=='O' && a[4]=='O'&& a[6]=='O')
                ctr=2;
                System.out.print('\u000C');
                System.out.println("_"+a[0]+"_|_"+a[1]+"_|_"+a[2]+"_");
                System.out.println("_"+a[3]+"_|_"+a[4]+"_|_"+a[5]+"_");
                System.out.println(" "+a[6]+" | "+a[7]+" | "+a[8]+" ");
            }
            if(ctr==1)
            {
            System.out.println(p1+" wins!!!");
            break;
            }
            else if(ctr==2)
            {
            System.out.println(p2+" wins!!!");
            break;
            }
        }
        if(ctr==0)
        System.out.println("its a draw :(");
        System.out.println("Press 1 to play again or 0 to exit");
        int c=pv.nextInt();
        if(c==1)
        {
            for(int i=0;i<9;i++)
            {
                a[i]=' ';
            }
            p1="";
            p2="";
            obj.game();
        }
        else
        {
        System.out.println("Thank you for playing");
        System.exit(0);
        }
    }
    static void game()
    {
        tic_tac_toe br = new tic_tac_toe();
        br.welcome();
        br.working();
    }
    public static void main(String[] args)
    {
        tic_tac_toe or = new tic_tac_toe();
        or.game();
    }
}