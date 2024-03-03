import java.util.Scanner;

class ReverseString{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String 	inputString = sc.next();
		System.out.println();
		
		for(int i=inputString.length()-1;i>=0;i--){
			System.out.print(inputString.charAt(i));
		}
	}
}