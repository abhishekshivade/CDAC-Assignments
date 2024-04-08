/*It's a number that equals the sum of its digits, each raised to a power.*/
import java.util.Scanner;;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int in=sc.nextInt(),n=0,res=0,num=0;

        num=in;

// for calculating number of digits
        while (num!=0) {
            num/=10;
            ++n;
        }

        num=in;

// for seaprating each digits and raising to power and add to result
        while (num!=0) {
            int rem=num%10;
            res+=Math.pow(rem,n);
            num/=10;
        }

// checking res and number
        if(res==in) System.out.println(in+" is an Armstrong number");
        else System.out.println(in+" is not an Armstrong number");

        sc.close();
    }
}
