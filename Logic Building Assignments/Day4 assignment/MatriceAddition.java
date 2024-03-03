import java.util.Scanner;

class MatriceAddition{
	public static void main(String arg[]){

		int a=3,b=3;

		int matrix1[][] = new int[a][b];
		int matrix2[][] = new int[a][b];
		int result[][] = new int[a][b];

		Scanner sc = new Scanner(System.in);

		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){
				System.out.println("Enter number for matrix 1");
				matrix1[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[i].length;j++){
				System.out.println("Enter number for matrix 2");
				matrix2[i][j]=sc.nextInt();
			}
		}

		System.out.println("Printing matrix 1");

		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){
				System.out.print(" "+matrix1[i][j]+" ");
			}
			
			System.out.println();
		}

		

		System.out.println("Printing matrix 2");

		for(int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[i].length;j++){
				System.out.print(" "+matrix2[i][j]+" ");
			}
			
			System.out.println();
		}

		
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[i].length;j++){
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}

		System.out.println("Printing matrix result");

		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(" "+result[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}