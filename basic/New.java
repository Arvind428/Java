
import java.util.Scanner;

//write a program in java print sum of array elements
class New{
    public static void main(String[]args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            arr2[i]=arr1[i];
        }
        System.out.println("Array2 Elements are");
        for(i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}