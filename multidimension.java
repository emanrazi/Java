import java.util.Scanner;
public class multidimension 
{
    public static void main(String[] args)
    {
       System.out.println("Input elements in Array");
       Scanner sc=new Scanner(System.in);
       int [][] arr=new int[2][3];

       for(int i=0;i<2;i++)
       {
        for(int j=0;j<3;j++)
        {
          arr[i][j]=sc.nextInt();
        }
       }

       System.out.println("Printing elements of array");
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<3;j++)
        {
          System.out.print(arr[i][j]+" ");
        }
       }
       sc.close();
    }
}
