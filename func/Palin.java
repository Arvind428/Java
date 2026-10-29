import java.util.*;
class Palin{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int r=0;

        while(n>0)
        {
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
            if(org==r){
    System.out.println("palindrome");
    }
}
}