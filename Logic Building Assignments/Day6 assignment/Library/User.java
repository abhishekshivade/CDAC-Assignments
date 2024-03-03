class User{
	int userId;
	String name;
	int booksBorrowed;

	User(){
		/*
		userId=;
		name=;
		booksBorrowed=;
		*/
	}
	
	void borrowBook(int bookIndex){
		
		Book userBook = new Book();

		if(userBook.isAvailable[bookIndex]){
			System.out.println("Book Borrowed Successfully");
			userBook.isAvailable[bookIndex]=false;
		}else {
			System.out.println("Book is not available, Please read another book");
		}
	}

	void returnBook(int bookId){

		Book userBook = new Book();
			userBook.isAvailable[bookId]=true;
			System.out.println("Book Returned Successfully");
	}
}
