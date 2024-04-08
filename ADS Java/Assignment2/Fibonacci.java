import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
	
	// adding previous to numbers by calling fib function recursively
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void print(int n) {
        if (n <= 0) {
            return;
        }

	// for printing and calling fib function
        System.out.print(fib(n - 1) + " ");

        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int count = sc.nextInt();

        print(count);

        sc.close();
    }
}
