public class Expessions {
    public static void main(String[] args){
        float a=7/4.0f*9/2.0f;
        System.out.println(a);

        String name="Eman";
        System.out.println(name.substring(0));

        String str1=new String("     My name is Eman . . .      ");
        System.out.println(str1.trim());
        System.out.println("Length of Name is: "+name.length());
        System.out.println(name.replace('E','I'));
        System.out.println(name.startsWith("Em"));
        System.out.println(name.endsWith("Em"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("an",1));
        System.out.println(name.lastIndexOf("an",3));
    }
    
}
