public class Override 
{
    class A 
    {
        void method1()
        {
            System.out.println("I am method1 of class A");
        }
    }

    class B extends A{
        //overriding
        void method1()
        {
            System.out.println("I am method1 of class B");
        }
        void method2()
        {
            System.out.println("I am method2 of class B");
        }
    }

    public static void main(String[] args)
    {
       Override obj=new Override();
       A a=obj.new A();
       a.method1();
       B b=obj.new B();
       b.method1();
       b.method2();
    }
}
