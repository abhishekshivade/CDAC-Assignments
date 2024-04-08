import java.util.Scanner;

class Calculator{

	//static int numr;
	//static int denr;

	static Scanner sc = new Scanner(System.in);

	static int readNumerator(){
		System.out.print("Enter Numerator : ");
		int numerator=sc.nextInt();
		return numerator;
	}

	static int readDenominator(){
		System.out.print("Enter Denominator : ");
		int denominator=sc.nextInt();
		return denominator;
	}

	static void add(int n1,int d1,int n2,int d2){
		int n=(n1*d2)+(n2*d1);
		int d=d1*d2;
		simplify(n,d);	
	}

	static void sub(int n1,int d1,int n2,int d2){
		int n=(n1*d2)-(n2*d1);
		int d=d1*d2;
		simplify(n,d);	
	}

	static void mul(int n1,int d1,int n2,int d2){
		int n=n1*n2;
		int d=d1*d2;
		simplify(n,d);
	}

	static void div(int n1,int d1,int n2,int d2){
		int n=n1*d2;
		int d=n2*d1;
		simplify(n,d);
	}

	static void simplify(int n,int d){
		/*
		int[] prime={2,3,5,7,11,13,17,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		for(int i:prime){
			if(n%i==0 && d%i==0){
				n/=i;
				d/=i;
			}
		}
		numr=n;
		denr=d;
		*/

		int gcd = gcd(n,d);
		int numr=n/gcd;
		int denr=d/gcd;

		System.out.println("Result : "+numr+"/"+denr);
	}

	static int gcd(int n,int d){
		if(d==0) return n;
		return gcd(d,n%d);
	}

	static void menu(RationalNumber num1,RationalNumber num2){
		int n1=num1.getNumerator();
		int d1=num1.getDenominator();
		int n2=num1.getNumerator();
		int d2=num1.getDenominator();
		int choice=0;
		
		do{
			System.out.println("Rational Number Calculator");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multilication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			System.out.println();
		
			if(choice>4) System.out.println("Select correct option");
			else{
				switch(choice){
					case 1:
						add(n1,d1,n2,d2);
						//System.out.println(numr+"/"+denr);
						break;
					case 2:
						sub(n1,d1,n2,d2);
						//System.out.println(numr+"/"+denr);
						break;
					case 3:
						mul(n1,d1,n2,d2);
						//System.out.println(numr+"/"+denr);
						break;
					case 4:
						div(n1,d1,n2,d2);
						//System.out.println(numr+"/"+denr);
						break;
					case 0:
						System.exit(0);
				}
			}
		}while(choice!=0);
	}
	
	public static void main(String[] args){

		System.out.println("Enter Num1 : ");
		RationalNumber num1=new RationalNumber(readNumerator(),readDenominator());
		
		System.out.println("Enter Num2 : ");		
		RationalNumber num2=new RationalNumber(readNumerator(),readDenominator());

		Calculator.menu(num1,num2);

		
	}
}