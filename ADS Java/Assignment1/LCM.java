import java.util.Scanner;

class LCM{
    static int gcd(int a,int b){
		if(b==0) return a;
	
		return gcd(b,a%b);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a=sc.nextInt();

		System.out.print("Enter 2nd number : ");
		int b=sc.nextInt();

		
		int gcd=gcd(a,b);

		// calculate product of both numbers
        	int mul=a*b;

		// divide product by gcd
	        int lcm=mul/gcd;

		System.out.println("LCM of "+a+" and "+b+" : "+lcm);
        	sc.close();
	}
}