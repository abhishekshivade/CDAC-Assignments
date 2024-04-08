import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number : ");
        String num=sc.next();

        boolean flag=false;

// checking character from both end are equal or not.
        for(int i=0,j=num.length()-1;i<num.length()/2;i++,j--){
            if(num.charAt(i)==num.charAt(j)) flag=true;
            else {
                flag=false;
                break;
            }
        }

        if(flag)System.out.println(num+" is a palindrome");
        else System.out.println(num+" is not a palindrome");

        sc.close();
    }
}
