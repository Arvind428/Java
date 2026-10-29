// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Even {
    public static void main(String[] args){
        int a;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        //if (a%2==0)
        if((a&1)==0)
        //if(a/2*2==n)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}