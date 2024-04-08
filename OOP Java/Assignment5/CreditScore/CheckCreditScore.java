import java.util.Scanner;

class CheckCreditScore{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CreditScoreCalculator csc = new CreditScoreCalculator();
		
		System.out.print("Enter Credit History : ");
		csc.setCreditHistory(sc.nextInt());
		System.out.println();

		System.out.print("Enter Credit Utilization : ");
		csc.setCreditUtilization(sc.nextDouble());
		System.out.println();

		System.out.print("Enter Payment History : ");
		csc.setPaymentHistory(sc.nextBoolean());
		System.out.println();

		int creditScore=csc.calculateCreditScore();

		System.out.print("Credit Score : "+creditScore);
		System.out.println();
		
		if(creditScore<300) System.out.println("You have very poor score");
		else if(creditScore>=300 && creditScore<=550) System.out.println("You have poor credit score");
		else if(creditScore>550 && creditScore<=650) System.out.println("You have good credit score");
		else if(creditScore>650 && creditScore<=750) System.out.println("You have Good credit score");
		else if(creditScore>750 && creditScore<=900) System.out.println("You have Excellent credit score");
		else System.out.println("You have Too Excellent credit score");
		
	}
}