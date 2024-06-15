public class Constructor 
{
    class Vehicle
    {
        String vehicle_name;
        String company_name;
        String plate_no;
    }

    class Car extends Vehicle{
        String color;

        Car(String name, String company, String PlateNo, String c)
        {
            vehicle_name=name;
            company_name=company;
            plate_no=PlateNo;
            color=c;
        }
    }
    public static void main(String[] args)
    {
     Constructor obj=new Constructor();
     Car car=obj.new Car("Car", "Honda", "123-Dr23", "Balck");
     System.out.println("Vehicle NAme is = "+car.vehicle_name);
     System.out.println("Company NAme is = "+car.company_name);
     System.out.println("Plate No. is = "+car.plate_no);
     System.out.println("Vehicle Color is = "+car.color);
    }
}
