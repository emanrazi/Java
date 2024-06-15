import java.util.Scanner;

public class Calculator {

    void Addition(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("Addition = "+sum);
    }
 
    void Subtraction(int num1,int num2)
    {
        int sub=num1-num2;
        System.out.println("Subtraction = "+sub);
    }

    void Multiplication(int num1,int num2)
    {
        int mul=num1*num2;
        System.out.println("SMultiplication = "+mul);
    }

    void Divison(int num1,int num2)
    {
        int div=num1/num2;
        System.out.println("Divison = "+div);
    }
    public static void main(String[] args) 
    {
        Calculator c =new Calculator();
        int num1=3, num2=2;
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
           System.out.println("3. Multiplication");
           System.out.println("4. Divison");
           System.out.println("0. Exit");
           choice=sc.nextInt();
           switch(choice)
           {
            case 1:
            c.Addition(num1,num2);
            break;

            case 2:
            c.Subtraction(num1,num2);
            break;

            case 3:
            c.Multiplication(num1, num2);
            break;

            case 4:
            c.Divison(num1, num2);
            break;
            
            case 0:
            System.exit(0);
            break;
              
            default:
            System.out.println("Invalid Choice");
           }
        }while(choice!=0);
        sc.close();
    }
}