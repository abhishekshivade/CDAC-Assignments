import java.util.Scanner;

public class DCB {

    static String dcb(int num){
        if(num==0) return "";

	/* paasing half of number to function recursively and adding it remiander of number*/
        return dcb(num/2)+(num%2);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();

        System.out.println(dcb(num));

        sc.close();
    }
}
