// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Swap {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  a number");
        a=sc.nextInt();
        System.out.println("Enter the  b number");
        b=sc.nextInt();
        // System.out.println(a);
        // System.out.println(b);
        a=a^b;//a*b
        b=a^b;//a/b
        a=a^b;//a/b
        System.out.println("Swapped a is"+a);
        System.out.println("Swapped b  is "+b);
    }
}