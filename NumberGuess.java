import java.util.Scanner;
import java.util.Random;
public class NumberGuess 
{
    static Scanner sc=new Scanner(System.in);
    static Random rand=new Random();
    static boolean p=true;
    public static void main(String[] args)
    {
        int random=rand.nextInt(100)+1; //1 to 100
        while(p)
        {
            System.out.println("Guess a number: ");
            int number=sc.nextInt();
            if(number==random)
            {
                System.out.println("You guessed the correct number "+random);
                p=false;
            }
            else if(number<random)
            {
                System.out.println("Number is smaller");
            }
            else
            {
                System.out.println("NUmber is greater");
            }
        }

    }
}
