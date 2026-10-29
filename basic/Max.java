
import java.util.Scanner;

//write a java program print max value in an array
class Max{
    public static void main(String[]args){
        int n,i;
        //[1,3,45,6,78,0]
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element is:"+max);
    }
}