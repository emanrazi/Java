public class StringMethods 
{
    public static void main(String[] args)
    {
        String name="     EA CODE";
        System.out.println(" ORIGINAL STRING = "+name);

       // finding the length of string
      System.out.println("Length of string = "+name.length());

       //removing all the spaces from start and end 
       System.out.println("String after trimming = "+name.trim());

       //returning a substring from given indexes
       System.out.println("Substring = "+name.substring(5,7));

       //replace the characters of your name
       System.out.println("After replacing = "+name.replace('O','I'));

       //convert into lowercase
       System.out.println("Converting into Lowercase = "+name.toLowerCase());

       // returns true if name starts with ur given string otherwise false
       System.out.println("Name starts with given string or not = "+name.startsWith("EA"));

       //returns character at a given index
       System.out.println("Character at given index = "+name.charAt(5));

       //returns the starting index from where your string starts
       System.out.println("Given string starts from = "+name.indexOf("EA",4));

       //returns the last index from right to left
       System.out.println("Given string ends at = "+name.lastIndexOf("CODE",11));
       //it returns the index of character C

       //returns true if both strings are equal
       System.out.println("Both strings are equal or not = "+name.equals("     EA CODE"));
       
    }
}
