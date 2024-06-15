import java.util.Scanner;
public class ArraySum
 {
    static int max_size=5;
    static int[] arr=new int[max_size];
    static Scanner sc=new Scanner(System.in);
    void Inputarray()
    {
      System.out.println("ENter the numbers in array");
      for(int i=0;i<max_size;i++)
      {
        arr[i]=sc.nextInt();
      }
    }
    int Sum(int[] arr,int sum)
    {
      for(int i=0;i<max_size;i++)
      {
        sum=sum+arr[i];
      }

      return sum;
    }
        public static void main(String[] args)
    {
        int sum=0;
        ArraySum ar=new ArraySum();
        ar.Inputarray();
       sum = ar.Sum(arr,sum);
       System.out.println("Sum is = "+sum);

    }
}
