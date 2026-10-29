import java.util.*;
class Fact{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        long n=sc.nextInt();
            int fact=1;
            if(n<0){
                System.out.print("factorial not defined");    
            }
            else{
        for (int i=1;i<=n;i++){
            fact*=i;
        }
            System.out.print(fact);
    }
    }
}