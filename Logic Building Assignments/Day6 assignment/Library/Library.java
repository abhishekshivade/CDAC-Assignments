import java.util.Scanner;

class Library{
	static void displayMenu(){

		System.out.println("\n\nWelcome to Virtual Library Management System!\n\n");
		System.out.println("Enter your choice\n");
		System.out.println("1. Borrow a Book");
		System.out.println("2. Return a Book");
		System.out.println("3. Display Available Book");
		System.out.println("4. Display Borrowed Book");
		System.out.println("5. Exit");
	}

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int choice=0, bookIndex=0,userBookId=0,userId=0;

		Book bookObj = new Book();
		User userObj = new User();

		do{
			displayMenu();
			choice=sc.nextInt();
		
		System.out.println("User choice : "+choice);
		
			switch(choice){
				case 1:
					System.out.println("Borrow a Book");
					
					System.out.print("Enter your User ID : ");
					userId = sc.nextInt();
					System.out.println();
					System.out.print("Enter the Book ID you want to borrow : ");
					userBookId = sc.nextInt();
					System.out.println();
					
					bookIndex = bookObj.findBook(userBookId);
					System.out.println("Book Index : "+bookIndex);
					if(bookIndex<bookObj.bookId.length)					
						userObj.borrowBook(bookIndex);
					break;
				case 2:
					System.out.println("Return a Book");

					System.out.print("Enter your User ID : ");
					userId = sc.nextInt();
					System.out.println();
					System.out.print("Enter the Book ID you want to return : ");
					userBookId = sc.nextInt();
					System.out.println();
					
					bookIndex = bookObj.findBook(userBookId);

					if(bookIndex<bookObj.bookId.length)				
						userObj.returnBook(bookIndex);
					break;
				case 3:
					System.out.println("\n\nAvailable Books\n\n");
					bookObj.displayAvailabelBooks();
					break;
				case 4:
					System.out.println("Borrowed Books");
					bookObj.displayBorrowedBooks();
					break;
				case 5:
					System.out.println("Exiting Virtual Library Management System. Thank you!");
					System.exit(0);
					break;
			}
			
		}while(choice<5 || choice==0);
		sc.close();
	}
}


















