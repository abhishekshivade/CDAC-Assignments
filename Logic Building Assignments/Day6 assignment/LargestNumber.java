import java.util.Scanner;

class LargestNumber{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st Number : ");
		int firstNumber = sc.nextInt();
		System.out.println();

		System.out.print("Enter 2nd Number : ");
		int secondNumber = sc.nextInt();
		System.out.println();
		
		int largestNumber = (firstNumber>secondNumber) ? firstNumber : secondNumber;

		System.out.println("Largest Number : "+largestNumber);
	}
}