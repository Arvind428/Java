import java.util.*;
public class Marks
{
	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
	    marks=sc.nextInt();
		if(marks>=90){ 
		   System.out.println("A");
		}
		else if(marks>=75){
		    System.out.println("B+");
		}
		else if(marks>=50){
		    System.out.println("B");
		}
		else if(marks>=35){
		    System.out.println("C");
		}
		else{
		    System.out.println("FAIL");
        }
    }
}