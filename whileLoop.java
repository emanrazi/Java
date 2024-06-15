import java.util.Scanner;
public class whileLoop 
{
    public static void main(String[] args)
    {
        String name;
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the country name u want to print: ");
        name=sc.nextLine();

        System.out.print("How many times u want to print: ");
        n=sc.nextInt();

        int i=0;
        while(i<n)
        {
            System.out.println(name);
            i++;
        }

        sc.close();
    }
}
