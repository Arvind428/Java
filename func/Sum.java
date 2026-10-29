
import java.util.Scanner;
public class Sum{
    static void add(int a,int b){
        System.out.print("The sum of two numbers is:");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        add(x,y);
    }
}