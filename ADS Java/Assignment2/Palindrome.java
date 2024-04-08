import java.util.Scanner;

public class Palindrome {

    static boolean check(String s,int start,int end){
        if(start==end)return true;

	/* traversing string from both end by passing start and end variable recursively*/
        if(s.charAt(start)==s.charAt(end)) return check(s, start+1, end-1);
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s=sc.next().trim();

        if(check(s,0,s.length()-1))System.out.println(s+" is palindrome");
        else System.out.println(s+" is not palindrome");

        sc.close();
    }
}
