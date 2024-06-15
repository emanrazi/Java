import java.util.Scanner;
public class Recurssion 
{
    int Factorial(int num)
    {
      if(num==0 || num==1)
      {
        return 1;
      }
      else{
        return num*Factorial(num-1);
      }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Recurssion r=new Recurssion();
        System.out.println("Enter a numbber for finding factorial: ");
        int num=sc.nextInt();

        int result=r.Factorial(num);
        System.out.println("Factorial of "+num+ " is : "+result);
        sc.close();
    }
}
