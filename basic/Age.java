// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Age {
    public static void main(String[] args){
        int a;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a>=18)
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("not Eligible to vote");
        }
    }
}