
import java.util.Scanner;

public class DigitSum {

    static int sum(int num){
        if(num==0) return 0;

	// separating digits and passing number recursively
        else return (num%10)+sum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        
        System.out.println(sum(num));

        sc.close();
    }
}
