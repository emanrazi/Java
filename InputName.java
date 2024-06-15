import java.util.Scanner;
public class InputName {
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello! "+name+ " Have a Nice Day");

        int num1=5; int num2=6;
        System.out.println(num1<8 && num2<8);  // it will show true or false
        System.out.println(++num1);
        sc.close();

       /*  String name;
        name="eman";
        name=new String("Eman");
        System.out.println(name);*/

    }
    
}
