import java.util.Scanner;

class Bank{
	
	static void menu(Account account, Scanner sc){
		int choice=0;
		
		do{
			System.out.println();
			System.out.println("Welcome to e-Banking");
			System.out.println("1. Create new account");
			System.out.println("2. Deposite");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Show Account Information");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Select option : ");
			choice=sc.nextInt();
			System.out.println();

			if(choice>5){
				System.out.print("Please select correct option");

			}else{
				switch(choice){
					case 1:
						System.out.print("Enter Your Name : ");
						account.newAccount(sc.next());
						System.out.println("Account created successfully...!");
						account.showAccount();
						System.out.println();
						break;

					case 2:
						System.out.print("Enter Amount : ");
						account.deposit(sc.nextInt());
						System.out.println("Account Balance : "+account.getBalance()+".cr");
						System.out.println();
						System.out.println("Cash Credited Successfully...!");
						break;

					case 3:
						System.out.print("Enter Amount : ");
						account.withdraw(sc.nextInt());
						System.out.println("Account Balance : "+account.getBalance()+".cr");
						System.out.println();
						System.out.println("Cash Debited Successfully...!");
						break;

					case 4:
						System.out.print("Account Balance : "+account.getBalance()+".cr");
						System.out.println();
						break;

					case 5:
						account.showAccount();
						break;
					case 0:
						System.out.println("Successfully logged out...!");
						System.exit(0);
				}
			}

		}while(choice!=0);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		Bank.menu(account,sc);
		sc.close();
	}
}