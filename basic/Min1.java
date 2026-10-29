import java.util.*;
class Min1 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element is:"+min);

    }

}