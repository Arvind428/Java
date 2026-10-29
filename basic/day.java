// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class day {
    public static void main(String[] args){
        int day;
        System.out.println("enter the day");
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        
      switch(day)
      {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("wednwsday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("saturday");
            break;
        case 7:
            System.out.println("sunday");
            break;
        default :
    System.out.println("invalid ");
      }
    }
}