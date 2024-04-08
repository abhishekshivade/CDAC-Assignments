class CreditScoreCalculator{
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory;

	CreditScoreCalculator(){}

	void setCreditHistory(int creditHistory){
		this.creditHistory=creditHistory;
	}

	int getCreditHistory(){
		return creditHistory;
	}

	void setCreditUtilization(double creditUtilization){
		this.creditUtilization=creditUtilization;
	}

	double getCreditUtilization(){
		return creditUtilization;
	}

	void setPaymentHistory(boolean paymentHistory){
		this.paymentHistory=paymentHistory;
	}

	int calculateCreditScore(){
		int creditScore=0;
		if(paymentHistory) creditScore=(creditHistory*15)+(int)(creditUtilization*30)+55;
		else creditScore=(creditHistory*15)+(int)(creditUtilization*30)+35;
		return creditScore;
	}
}