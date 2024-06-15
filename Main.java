import java.util.Scanner;
public class Main { 
    public static void main(String[] args){
       /*  int  num1=5;
       int  num2=5;
        int sum=num1+num2;
        System.out.println("Sum of two numbers = "+sum);*/
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two Numbers = "+sum);
        sc.close();
    } 
   
}
