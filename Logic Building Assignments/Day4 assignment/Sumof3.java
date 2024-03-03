import java.util.Scanner;

class SumOf3{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int sum=0,t=0;

		System.out.println("Enter Number");
	
		int n=sc.nextInt();

		if(n<0){
			System.out.println("Please enter +ve number");
		}
		else{
			System.out.println("t=2*(i-1)");
			//for(int i=0;i<=n;i++){	//input is 10 gives 36 ans by adding t and 18 by adding i assigning t

			for(int i=0;i<n;i++){		//input is 10 gives 18 ans by adding t and 12 by adding i assigning t
				System.out.println("i : "+i);
				System.out.println("t = "+2+" * "+"( "+i+" - 1"+" )");
				t = 2*(i-1);
				System.out.println("t : "+t);
				if(t%3 == 0){
					//sum+=t;
					//sum=t;
					System.out.println("sum = "+sum+" + "+t);
					sum+=t;
				}
			}
			System.out.println("Sum : "+sum);
		}
	}
}