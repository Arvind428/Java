import java.util.*;
class Strng{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        /////////////////name1=sc.nextLine();
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("j"));
        System.out.println(name.toCharArray());
        }
}
