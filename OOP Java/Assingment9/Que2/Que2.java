import java.util.Scanner;

class Que2{

	static void checkNumber(int x){
		if(x%2!=0) throw new ArithmeticException("Number is odd");
		System.out.println("Number is even");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");

		checkNumber(sc.nextInt());
	}
}