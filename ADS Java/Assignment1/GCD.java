import java.util.Scanner;

class Que1{

	static int gcd(int a,int b){
		if(b==0) return a;

// divide one number by another number and again passing it to dunction
		return gcd(b,a%b);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a=sc.nextInt();

		System.out.print("Enter 2nd number : ");
		int b=sc.nextInt();
		
		System.out.println("GCD of "+a+" and "+b+" : "+gcd(a,b));

		sc.close();
	}
}