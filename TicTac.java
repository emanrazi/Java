import java.util.Scanner;
public class TicTac 
{
    private static final char NULL = 0;
    static Scanner sc=new Scanner(System.in);
    static String name1;
    static String name2;
    int player1;
    int player2;
    boolean p1=true;
    String RED = "\033[91m";
    String GREEN = "\033[92m";
    String YELLOW = "\033[93m";
    String BLUE = "\033[94m";
    int max_size=9;
    char [] arr={'1','2','3','4','5','6','7','8','9'};
    char[] newarr=new char [max_size];
     void Display()
    {
        System.out.println(YELLOW+"|   "+BLUE+arr[0]+"    |   "+BLUE+arr[1]+"    |   "+BLUE+arr[2]+"    |");
        System.out.println(YELLOW+"|________|________|________|");
        System.out.println(YELLOW+"|        |        |        |");
        System.out.println(YELLOW+"|   "+BLUE+arr[3]+"    |   "+BLUE+arr[4]+"    |   "+BLUE+arr[5]+"    |");
        System.out.println(YELLOW+"|________|________|________|");
        System.out.println(YELLOW+"|        |        |        |");
        System.out.println(YELLOW+"|   "+BLUE+arr[6]+"    |   "+BLUE+arr[7]+"    |   "+BLUE+arr[8]+"    |");
    }
    void GameDraw()
    {
       System.out.println(RED+"Game is drawn;; No player wins");
    }
    void CheckWin()
    {
      if((arr[0]=='O' &&arr[1]=='O' &&arr[2]=='O') ||(arr[0]=='O' &&arr[3]=='O' &&arr[6]=='O')||(arr[6]=='O' &&arr[7]=='O' &&arr[8]=='O')|| (arr[2]=='O' &&arr[5]=='O' &&arr[8]=='O')|| (arr[2]=='O' &&arr[4]=='O' &&arr[6]=='O') || (arr[0]=='O' &&arr[4]=='O' &&arr[8]=='O')||(arr[1]=='O' &&arr[4]=='O' &&arr[7]=='O')|| (arr[2]=='O' &&arr[5]=='O' &&arr[8]=='O') )
      {
        System.out.println(YELLOW+"Congratulations!! "+name1+" you win");
        System.exit(0);
      }
      if((arr[0]=='X' &&arr[1]=='X' &&arr[2]=='X') ||(arr[0]=='X' &&arr[3]=='X' &&arr[6]=='X')||(arr[6]=='X' &&arr[7]=='X' &&arr[8]=='X')|| (arr[2]=='X' &&arr[5]=='X' &&arr[8]=='X')|| (arr[2]=='X' &&arr[4]=='X' &&arr[6]=='X') || (arr[0]=='X' &&arr[4]=='X' &&arr[8]=='X')||(arr[1]=='X' &&arr[4]=='X' &&arr[7]=='X')|| (arr[2]=='X' &&arr[5]=='X' &&arr[8]=='X') )
      {
        System.out.println(YELLOW+"Congratulations!! "+name2+" you win");
        System.exit(0);
      }

    }
    void Player1()
    {
        for(int i=0;i<9;i++)
        {
           if(i==player1-1)
           {
            if(newarr[i]==NULL)
            {
                newarr[i]='O';
                arr[i]=newarr[i];
                Display();
            }
            else
            {
                System.out.println("Space Already Occupied,,Again Input");
                Input();
            }
           }
        }
    }
    void Player2()
    {
        for(int i=0;i<9;i++)
        {
           if(i==player2-1)
           {
            if(newarr[i]==NULL)
            {
                newarr[i]='X';
                arr[i]=newarr[i];
                Display();
            }
            else
            {
                System.out.println("Space Already Occupied,,Again Input");
                Input();
            }
           }
        }
        return ;
    }
    void Input()
    {
        for(int i=0;i<9;i++)
        {
            if(p1)
            {
                System.out.println(BLUE+name1+"'s turn---> O");
                player1=sc.nextInt();
                if(player1<1 || player1>9)
                {
                    System.out.println("Space not found,Again Input");
                    Input();
                }
                Player1();
                p1=false;
                CheckWin();
            }
            else
            {
                System.out.println(YELLOW+name2+"'s turn---> X");
                player2=sc.nextInt();
                if(player2<1 || player2>9)
                {
                    System.out.println("Space not found,Again Input");
                    Input();
                }
                Player2();
                p1=true;
                CheckWin();
            }
        }
    }
   public static void main(String[] args)
    {
         TicTac t=new TicTac();
         System.out.println("Enter player1 name: ");
         name1=sc.nextLine();
         System.out.println("Enter player2 name: ");
         name2=sc.nextLine();
         t.Display();
         t.Input();
         t.GameDraw();

    }
}
