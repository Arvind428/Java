import java.util.*;
class Prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i,a,count=0;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println(a+" is a prime number");
        }
        else{
            System.out.println(a+" is not a prime number");
        }
    }
}