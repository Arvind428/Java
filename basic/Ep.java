import java.util.*;
class Ep {
    public static void main(String[] args){
        int a,i;
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++){
            if(i%2==0)
            {
                System.out.println("Even="+i);
            }
            else{
                System.out.println("Odd="+i);
            }
        }
    }
}