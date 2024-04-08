import java.util.Scanner;

class BillCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Cutsomer Name : ");
		String customerName=sc.next();

		System.out.print("Enter Phone Number (without 0 at start) : ");
		long phoneNumber=sc.nextLong();

		System.out.print("Enter Number of calls : ");
		int callCount=sc.nextInt();

		System.out.print("Enter Duration of calls (in minutes) : ");
		double callDuration=sc.nextDouble();
		
		TelephoneBill bill = new TelephoneBill(customerName,phoneNumber,callCount,callDuration);

		System.out.println("Bill for month");
		bill.showBill();
	}
}