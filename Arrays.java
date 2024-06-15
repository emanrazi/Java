import java.util.Scanner;
public class Arrays 
{
    static Scanner sc=new Scanner(System.in);
    static int max_size=5;
    static int[] arr=new int[max_size];
    void Display()
    {
       for(int i=0;i<max_size;i++)
       {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    int Search()
    {
      int key;
      System.out.print("Enetr the element u want to search in array: ");
      key = sc.nextInt();

      for(int i=0;i<max_size;i++)
      {
         if(key==arr[i])
         {
            return 1;
         }
      }
      return 0;
    }

    int InsertAtStart(int element)
    {
      max_size++;
      int [] newarr= new int[max_size];
      for(int i=1;i<max_size;i++)
      {
         newarr[i]=arr[i-1];
      }
      newarr[0]=element;
      arr=newarr;
      return element;
    }

    int InsertAtEnd(int element)
    {
      max_size++;
      int[] newarr=new int[max_size];
      for(int i=0;i<max_size-1;i++)
      {
         newarr[i]=arr[i];
      }
      newarr[max_size-1]=element;
      arr=newarr;
      return element;
    }

    int InsertAtAnywhere(int key,int pos)
    {
      max_size++;
      int [] newarr = new int[max_size];
      for(int i = 0; i < pos - 1; i++)
      {
         newarr[i] = arr[i];
      }
      newarr[pos - 1] = key;
      for(int i = pos; i < max_size; i++)
      {
         newarr[i] = arr[i - 1];
      }
      arr = newarr;
      return key;
    }

    int DeleteAtStart()
    {
       int[] newarr=new int[max_size];
       int element=arr[0];
       for(int i=0;i<max_size-1;i++)
       {
         newarr[i]=arr[i+1];
       }
       max_size--;
       arr=newarr;
       return element;
    }

    int DeleteAtEnd()
    {
      max_size--;
      int element=arr[max_size];
      int[] newarr=new int[max_size];
      for(int i=0;i<max_size;i++)
      {
         newarr[i]=arr[i];
      }
      arr=newarr;
      return element;
    }

    int DeleteAtAnywhere(int pos)
    {
      int element=arr[pos-1];
      max_size--;
      int[] newarr=new int[max_size];
      for(int i=0;i<pos-1;i++)
      {
         newarr[i]=arr[i];
      }
      for(int i=pos-1;i<max_size;i++)
      {
         newarr[i]=arr[i+1];
      }
      arr=newarr;
      return element;
    }

    int Update(int pos,int val)
    {
      int[] newarr=new int[max_size];
      for(int i=0;i<max_size;i++)
      {
         newarr[i]=arr[i];
      }
      for(int i=0;i<max_size;i++)
      {
        if(newarr[i]==pos-1)
        {
            newarr[pos-1]=val;
            arr=newarr;
            return 1;
        }
      }
      return 0;
    }
 public static void main(String[] args)
    {
        Arrays ar=new Arrays();
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int choice;
        do{
           System.out.println("1. Displaying Array");
           System.out.println("2. Serachinng");
           System.out.println("3. Inserting At Start");
           System.out.println("4. Inserting At End");
           System.out.println("5. Insertion At Anywhere");
           System.out.println("6. Deleting at Start");
           System.out.println("7. Deleting at End");
           System.out.println("8. Deleting at Anywhere");
           System.out.println("9. For Updating");
           System.out.println("0. Exit");
           choice=sc.nextInt();
           switch(choice)
           {
            case 1:
               ar.Display();
               break;

            case 2:
              int result= ar.Search();
              if(result==1)
              {
                 System.out.println("Search found");
              }
              else
              {
               System.out.println("Search Not Found");
              }
               break;

            case 3:
            System.out.print("Enter the element u want to insert at start: ");
            int element=sc.nextInt();
            int res=ar.InsertAtStart(element);
            System.out.println("Element "+res+" Inserted successfully");
            break;

            case 4:
            System.out.print("Enter the element u want to insert at end: ");
            int ele=sc.nextInt();
            int res1=ar.InsertAtEnd(ele);
            System.out.println("Element "+res1+" Inserted successfully");
            break;
            
            case 5:
            System.out.print("Enter the element u want to insert : ");
            int key=sc.nextInt();
            System.out.print("Enter the position where u want to insert : ");
            int pos=sc.nextInt();
            int resu=ar.InsertAtAnywhere(key,pos);
            System.out.println("Element "+resu+" Inserted successfully");
            break;

            case 6:
            int r=ar.DeleteAtStart();
            System.out.println("Element "+r+" Deleted successfully");
            break;

            case 7:
            int re=ar.DeleteAtEnd();
            System.out.println("Element "+re+" Deleted successfully");
            break;

            case 8:
            System.out.println("Enter thee position where u want to delete: ");
            int p=sc.nextInt();
            int resul=ar.DeleteAtAnywhere(p);
            System.out.println("Element "+resul+" Deleted successfully");
            break;

            case 9:
            System.out.println("Enter the position where u want to update: ");
            int po=sc.nextInt();
            System.out.println("Eneter the new value : ");
            int value=sc.nextInt();
            int results=ar.Update(po,value);
            if(results==1)
            {
            System.out.println("Element updated successfully");
            }
            else
            {
               System.out.println("Position not found");
            }
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
