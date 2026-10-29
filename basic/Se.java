
import java.util.Scanner;

//write a program in java print sum of array elements
class Se{
    public static void main(String[]args){
        int n,sum,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        sum=0;
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is");
        System.out.println(sum);

    }
}