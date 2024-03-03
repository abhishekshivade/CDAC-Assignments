import java.util.Scanner;

class Palindrome{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		String inputString, reverseString;
		boolean palindrome=false;

		System.out.print("Enter a string : ");
		inputString = sc.next();
		System.out.println();
		
		for(int i=0, j=inputString.length()-1; i<inputString.length()/2; i++,j--){
			if(inputString.charAt(i)==inputString.charAt(j)){
				palindrome=true;
			}else{
				palindrome=false;
				break;
			}
		}
		
		if(palindrome)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}