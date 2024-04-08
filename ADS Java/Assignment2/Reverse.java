import java.util.Scanner;

public class Reverse {

    static String reverse(String s){
        if(s.length()==1 || s.isEmpty()) return s;

	// reverse string by seaparating 1st char recursively
        return reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=sc.nextLine();

        System.out.println(reverse(s));

        sc.close();
    }   
}
