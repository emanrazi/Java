public class CustomClass {

    class Employee
    {
        int emp_id;
        String emp_name;

        void Display()
        {
            System.out.println("Employee id is = "+emp_id);
            System.out.println("Employee name is = "+emp_name);
        }
    }
    public static void main(String[] args) 
    {
      CustomClass custom= new CustomClass();
      Employee emp=custom.new Employee();
      emp.emp_id=1;
      emp.emp_name="EA Code";
      emp.Display();
    }
}