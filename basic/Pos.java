import java.util.*;
class Pos {
    public static void main(String[] args){
        int a;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>0){
            System.out.println("Positive number");       
        }
        else if(a<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}