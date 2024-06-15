import java.util.Scanner;
public class methods 
{
    static Scanner sc=new Scanner(System.in);
    static void Sum(int num1,int num2)
    {
       int sum=num1+num2;
       System.out.println("Sum of two numbers = "+sum);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second number: ");
        int num2=sc.nextInt();

        Sum(num1,num2);
    }
}
