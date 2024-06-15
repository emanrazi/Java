public class this_super 
{
    class Person
    {
        String name;
        int id;
        Person(String name,int id)
        {
            this.name=name;
            this.id=id;
        }
    }

    class Employee extends Person
    {
       int emp_cnic;
       Employee(String name,int id,int emp_cnic)
       {
        super(name,id);
        this.name=name;
        this.id=id;
        this.emp_cnic=emp_cnic;
       }
    }
    public static void main(String[] args)
    {
      this_super obj=new this_super();
      //Person person=obj.new Person("EA Code", 1);
      //System.out.println("Id is: "+person.id);
      //System.out.println("Name is: "+person.name);
      Employee emp=obj.new Employee("EA Code",1,12345);
      System.out.println("Id is: "+emp.id);
      System.out.println("Name is: "+emp.name);
      System.out.println("CNIC is: "+emp.emp_cnic);
    }
}
