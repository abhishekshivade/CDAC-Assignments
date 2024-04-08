import java.util.Scanner;

class Que4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Enter num1 : ");
			int num1=sc.nextInt();

			System.out.print("Enter num2 : ");
			int num2=sc.nextInt();

			System.out.println(num1/num2);
		}catch(ArithmeticException ae){
			System.out.println("Catching Arithmetic Exception");
			ae.printStackTrace();
		}catch(RuntimeException re){
			System.out.println("Catching Runtime Exception");
			re.printStackTrace();
		}catch(InputMismatchException ie){
			System.out.println("Catching Input Exception");
			ie.printStackTrace();
		}catch(Exception e){
			System.out.println("Catching Exception");
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
	}
}