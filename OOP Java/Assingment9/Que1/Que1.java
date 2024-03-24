import java.util.Scanner;

class Que1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1 : ");
		int num1=sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2=sc.nextInt();
		
		try{
			if(num2==0) throw new ArithmeticException("Enter correct input divider can not be zero");
			System.out.println(num1/num2);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			sc.close();
		}
	}
}