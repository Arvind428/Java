import java.util.*;
class Vow{
    public static void main(String[] args) {
        String s;
        int i,c=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine().toLowerCase();
        for(i=0;i<s.length();i++)
        {
            char ch=(s.charAt(i));
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u' )
            {
                c=c+1;
            }
        }
        System.out.println(c);
        sc.close();

    }
}
