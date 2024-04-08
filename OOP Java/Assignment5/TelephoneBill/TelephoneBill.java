class TelephoneBill{
	private String customerName;
	private long phoneNumber;
	private int callCount;
	private double callDuration;

	TelephoneBill(String customerName, long phoneNumber, int callCount, double callDuration){
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.callCount=callCount;
		this.callDuration=callDuration;
	}

	double calculate100Call(int callCount){
		return callCount*0.50;
	}

	double calculateRestCall(int callCount){
		return callCount*0.25;
	}

	double calculateBill(){
		if(callCount<=100) return calculate100Call(callCount);
		else return calculate100Call(100)+calculateRestCall(callCount-100);
	}

	void showBill(){
		double billAmount = calculateBill();
		System.out.println("Customer Name   : "+customerName);
		System.out.println("Phone Number    : "+phoneNumber);
		System.out.println("Call Count	    : "+callCount);
		System.out.println("Call Duration   : "+callDuration);
		System.out.println("Calculated Bill : $"+billAmount);
		System.out.println("Discount	    : $10");
		System.out.println("Total Bill	    : $"+(billAmount-10));
	}
}