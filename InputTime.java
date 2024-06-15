import java.util.Scanner;

public class InputTime 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
          System.out.println("Enter the time in hh:mm:ss ");
          int hour=sc.nextInt();
          int minute=sc.nextInt();
          int second=sc.nextInt();
          sc.nextLine();

          System.out.println("Is it Antie Melidiem(AM) or Post Melidiem(PM) ? ");
          String choice=sc.nextLine();
          System.out.println("Current time u entered = "+hour+":"+minute+":"+second+" "+choice);

          if(choice.equalsIgnoreCase("am"))
          {
            if(hour<=12 && hour>=5 && minute==0 && second == 0)
            {
                System.out.println("GOOD MORNING");
            }
            else if(hour<=12 && hour>=5 && minute<=60 && second <=60)
            {
                System.out.println("GOOD MORNING");
            }
            else
            {
                System.out.println("Invalid Input! Time not found");
            }
          }

          else if(choice.equalsIgnoreCase("pm"))
          {
            if(hour<=18 && hour>=12 && minute==0 && second==0)
            {
                System.out.println("GOOD AFTERNOON");
            }
            else if(hour<=18 && hour>=12 && minute<=60 && second<=60)
            {
                System.out.println("GOOD AFTERNOON");
            }

            else if(hour>=18 && hour<=21 && minute==0 && second==0)
            {
                System.out.println("GOOD EVENING");
            }

            else if(hour>=18 && hour<=21 && minute<=60 && second<=60)
            {
                System.out.println("GOOD EVENING");
            }

            else if((hour>=21 && hour<=24)|| (hour>=0 && hour<5 && minute==0 && second==0))
            {
                System.out.println("GOOD NIGHT");
            }

            else if((hour>=21 && hour<=24)|| (hour>=0 && hour<5 && minute<=60 && second<=60))
            {
                System.out.println("GOOD NIGHT");
            }

            else
            {
                System.out.println("Invalid Input! Time not found");
            }
          }
          sc.close();
    }
}
