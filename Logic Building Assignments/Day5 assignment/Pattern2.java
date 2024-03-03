import java.util.Scanner;

class Pattern2{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}