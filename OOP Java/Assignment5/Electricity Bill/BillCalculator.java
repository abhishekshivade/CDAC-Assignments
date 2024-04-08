import java.util.Scanner;

class BillCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter customer Name : ");
		String customerName=sc.next();

		System.out.print("Enter units consumed : ");
		double unitsConsumed=sc.nextDouble();

		ElectricityBill bill = new ElectricityBill(customerName,unitsConsumed);

		System.out.println("Customer Details");
		System.out.println("Name 		: "+bill.getCustomerName());
		System.out.println("Units Consumed 	: "+bill.getUnitsConsumed());
		System.out.println("Bill Calculated	: "+bill.calculateBillAmount());
		
	}
}