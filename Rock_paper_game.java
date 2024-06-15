import java.util.Scanner;
import java.util.Random;
public class Rock_paper_game {
    public static void main(String[] args){

        System.out.println("1. For Rock.");
        System.out.println("2. For Paper.");
        System.out.println("3. For Sisicor.");
        System.out.println("Enter the option:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("You Selected Rock.");
                Random random = new Random();
                int rn =  random.nextInt(3);
                if(rn == 1){
                    System.out.println("The second player select Rock.");
                    System.out.println("Results are equal. No one won.");
                }
                else if(rn == 2){
                    System.out.println("2nd player select Paper.");
                    System.out.println("2nd palyer won. Better luck next time.");
                }
                else {
                    System.out.println("2nd Pllayer select Siscor");
                    System.out.println("You won buddy.");
                }
                break;
            }
            case 2:
            {
                System.out.println("You selected Paper.");
                Random random2 = new Random();
                int rn2 = random2.nextInt(3);
                if(rn2 == 1){
                    System.out.println("2nd Player select the Rock.");
                    System.out.println("You Won.");
                }
                else if(rn2 == 2){
                    System.out.println("2nd Player select the Paper");
                    System.out.println("Results are eqaul and no one won.");
                }
                else {
                    System.out.println("2nd Player select the Siscor.");
                    System.out.println("So 2nd Player won. Better luck next time!");
                }
                break;
            }
            case 3:
            {
                System.out.println("You select the Siscor.");
                Random random3 = new Random();
                int rn3 = random3.nextInt(3);
                if(rn3 == 1){
                    System.out.println("2nd player select the Rock.");
                    System.out.println("2nd Palyer Won.");
                }
                else if(rn3 == 2){
                    System.out.println("2nd player select the Paper.");
                    System.out.println("You won.");
                }
                else {
                    System.out.println("2nd player select the sicsor.");
                    System.out.println("Results are equal. No one won.");
                }
                break;
            }
        }
        sc.close();

    }
} 
