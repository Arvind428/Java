import java.util.*;
class Sum {
    public static void main(String[] args){
        int n,sum;
        sum=0;
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}