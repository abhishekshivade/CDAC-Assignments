import java.util.Random;

class Account{
	private String accountName;
	private int accountNumber;
	private double balance;
	private Random random = new Random();

	void newAccount(String accountName){
		this.accountName=accountName;
		accountNumber=10000+random.nextInt(999-100+1)+100;
	}

	double deposit(double amount){
		balance+=amount;
		return balance;
	}
	
	double withdraw(double amount){
		balance-=amount;
		return balance;
	}

	void showAccount(){
		System.out.println("Account Name    : "+accountName);
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Balance : "+balance+".cr");
	}

	double getBalance(){
		return balance;
	}
}