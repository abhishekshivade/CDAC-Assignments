class ElectricityBill{
	private String customerName;
	private double unitsCounsumed;
	private double billAmount;

	ElectricityBill(String customerName, double unitsCounsumed){
		this.customerName=customerName;
		this.unitsCounsumed=unitsCounsumed;
	}

	String getCustomerName(){
		return customerName;
	}
	
	double getUnitsConsumed(){
		return unitsCounsumed;
	}

	double calculate100Unit(double units){
		return units*5;
	}

	double calculate200Unit(double units){
		return units*7;
	}

	double calculateRestUnit(double units){
		return units*10;
	}
	
	double calculateBillAmount(){
		if(unitsCounsumed<=100){
			billAmount=calculate100Unit(unitsCounsumed);
		}else if(unitsCounsumed<=200){
			billAmount=calculate100Unit(100)+calculate200Unit(unitsCounsumed-100);
		}else{
			billAmount=calculate100Unit(100)+calculate200Unit(100)+calculateRestUnit(unitsCounsumed-200);
		}
		return billAmount;
	}
}