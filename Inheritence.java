public class Inheritence 
{
    class Animal
    {
        private String animal_name;
        private String color;
        private String type;
        int legs;

        void setName(String name)
        {
            animal_name=name;
        }
        void setType(String t)
        {
           type=t;
        }
        void setColor(String c)
        {
          color=c;
        }
        void  setLegs(int l)
        {
            legs =l;
        }

        String getNAme()
        {
            return animal_name;
        }
        String getColor()
        {
            return color;
        }
        String getType()
        {
            return type;
        }
        int getLegs()
        {
            return legs;
        }
    }

    class Cat extends Animal
    {
       void Display()
       {
        System.out.println("Animal name is = "+getNAme());
        System.out.println("Animal Type is = "+getType());
        System.out.println("Animal Color is = "+getColor());
        System.out.println("Animal legs is = "+getLegs());
       }
    }
    public static void main(String[] args)
    {
     Inheritence obj=new Inheritence();
     Cat cat=obj.new Cat();
     cat.setName("Tom");
     cat.setType("Cat");
     cat.setLegs(4);
     cat.setColor("White");
     cat.Display();
    }
}
