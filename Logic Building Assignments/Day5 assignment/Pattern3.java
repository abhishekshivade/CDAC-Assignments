import java.util.Scanner;

class Pattern3{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");

		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			
			for(int k = 1;k<=i;k++){
				System.out.print(i+" ");
			}	
			
			System.out.println();
		}
	}
}