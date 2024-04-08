/*
Write an efficient Java/C/Python program to return the maximum occurring character in the input string

e.g., if the input string is "Java" then the function should return 'a'.
*/

import java.util.Scanner;

class Que1{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a word : ");
		String word=sc.next();
		System.out.println();

		System.out.println("Repeated letters in Word are : ");

		for(int i=0; i<word.length();i++){
			for(int j=i+1; j<word.length();j++){
				if(word.charAt(i)==word.charAt(j)){
					System.out.println(word.charAt(i));
				}
			}
		}

		sc.close();
	}

}