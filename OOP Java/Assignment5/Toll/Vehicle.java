class Vehicle{
	private String vehicleType;
	private int numAxles;
	private double distanceTravelled;
	private double tollFee;
	private double totalAmountDue;

	void setVehicleType(String vehicleType){
		this.vehicleType=vehicleType;
	}

	String getVehicleType(){
		return vehicleType;
	}

	void setNumAxles(int numAxles){
		this.numAxles=numAxles;
	}

	int getNumAxles(){
		return numAxles;
	}

	void setDistanceTravelled(double distanceTravelled){
		this.distanceTravelled=distanceTravelled;
	}

	double getDistanceTravelled(){
		return distanceTravelled;
	}

	void setTollFee(double tollFee){
		this.tollFee=tollFee;
	}

	double getTollFee(){
		return tollFee;
	}

	void setTotalAmountDue(double totalAmountDue){
		this.totalAmountDue=totalAmountDue;
	}
}