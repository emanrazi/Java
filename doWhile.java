import java.util.Scanner;

public class doWhile {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your country name: ");
        String name=sc.nextLine();

        System.out.println("How many times you want to print: ");
        int n=sc.nextInt();

        int i=0;
        do
        {
            System.out.println(name);
            i++;
        }while(i<n);
         sc.close();
    }
    
}
