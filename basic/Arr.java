import java.util.*;
class Arr {
    public static void main(String[] args){
        int i,n;
        System.out.println("Enter Size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array Values");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        System.out.println("Array values are");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}