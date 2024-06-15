class Constructors
{
    class Customer
    {
        int customer_id;
        String customer_name;
        String customer_CNIC;

        Customer(int id, String name, String CNIC)
        {
            customer_id=id;
            customer_name=name;
            customer_CNIC=CNIC;
        }
        public void Display()
        {
            System.out.println("Customer id is = "+customer_id);
            System.out.println("Customer name is = "+customer_name);
            System.out.println("Customer CNIC is = "+customer_CNIC);
        }
    }
    public static void main(String[] args)
    {
      Constructors obj=new Constructors();
      Customer custom=obj.new Customer(1,"EA Code","34201-123344");
      custom.Display();

    }
}