class GetterandSetter
{
    class Employee
    {
        private int emp_id;
        private String emp_name;

       public void setId(int id)
       {
        emp_id=id;
       }
       public void setName(String name)
       {
        emp_name=name;
       }
       public int getId(){
        return emp_id;
       }
       public String getName()
       {
        return emp_name;
       }
    }
    public static void main(String[] args)
    {
      GetterandSetter obj=new GetterandSetter();
      Employee emp=obj.new Employee();
      emp.setId(11);
      emp.setName("EA Code");
      //System.out.println("Employee id is = "+emp.getId());
     // System.out.println("Employee name is = "+emp.getName());
     System.out.println(emp.emp_id);
     System.out.println(emp.emp_name);

    }
}