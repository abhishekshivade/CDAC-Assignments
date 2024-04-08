import java.util.Scanner;

public class length {
    static int len(String s){
        if(s.isEmpty()) return 0;

	// separating each character adding 1 on each call
        return 1+len(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=sc.nextLine();

        System.out.println(len(s));

        sc.close();
    }
}
