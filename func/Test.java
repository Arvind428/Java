import java.util.*;
public class Test{
    static int Mul(int a,int b){
        return a*b;
    }
    public static void main(String [] args){
        int x,y,result;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        result=Mul(x,y);
        System.out.println(result);
    }
}