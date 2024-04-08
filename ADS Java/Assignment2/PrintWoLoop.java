import java.util.Scanner;

public class PrintWoLoop {

    static void print(int num){
        if(num>0) {
	
	//calling function recursively and passing with decrement
            print(num-1);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();

        print(num);

        sc.close();
    }
}
