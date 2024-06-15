import java.util.Scanner;
public class loops 
{
    public static void main(String[] args)
    {
        String name;
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("What is your name? ");

        name=sc.nextLine();

        System.out.print("How many times u want to print your name: ");

        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println(name);
        }

        sc.close();
  }
}
