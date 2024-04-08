// Write an efficient Java/C/Python/Ruby program to return the duplicate characters from given String, for example, if given String is "C++" then your program should print "+" Similarly, if the input is "Java and JavaScript" then your program should print "J", "a" and "v". You can ignore the case for finding duplicates.


import java.util.Scanner;

class Que3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str=sc.next();

		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)) System.out.println(str.charAt(i));
			}
		}
		sc.close();
	}
}