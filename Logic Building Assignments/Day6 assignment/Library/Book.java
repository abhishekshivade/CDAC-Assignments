class Book{
	/*
	int bookId[]=new int[5];
	String title[] =new String[5];
	String author[]=new String[5];
	boolean isAvailable[]=new boolean[5];
	*/

	int bookId[]={101,102,103,104,105};
	String title[] ={"Book1","Book2","Book3","Book4","Book5"};
	String author[]={"Author1","Author2","Author3","Author4","Author5"};
	boolean isAvailable[]={true,false,false,true,true};

	Book(){
	/*
	bookId[]={101,102,103,104,105};
	title[] ={"Book1","Book2","Book3","Book4","Book5"};
	author[]={"Author1","Author2","Author3","Author4","Author5"};
	isAvailable[]={true,false,false,true,true};
	*/
	}
	
	void diplayBookDetails(int bookIndex){
		System.out.println("BookId : "+bookId[bookIndex]);
		System.out.print("Title : "+title[bookIndex]);
		System.out.print("Author : "+author[bookIndex]);
		System.out.print("Is Available : "+isAvailable[bookIndex]);
	}

	void listBooks(){
		for(int bookIndex=0;bookIndex<bookId.length;bookIndex++){
			System.out.println("BookId : "+bookId[bookIndex]);
			System.out.print("Title : "+title[bookIndex]);
			System.out.print("Author : "+author[bookIndex]);
			System.out.print("Is Available : "+isAvailable[bookIndex]);
		}
	}

	void displayAvailabelBooks(){
		for(int bookIndex=0;bookIndex<bookId.length;bookIndex++){
			if(isAvailable[bookIndex]){
				System.out.print("BookId : "+bookId[bookIndex]);
				System.out.print(" | Title : "+title[bookIndex]);
				System.out.print(" | Author : "+author[bookIndex]);
				System.out.println();
			}
		}
	}

	void displayBorrowedBooks(){
		for(int bookIndex=0;bookIndex<bookId.length;bookIndex++){
			if(!isAvailable[bookIndex]){
				System.out.print(" BookId : "+bookId[bookIndex]);
				System.out.print(" | Title : "+title[bookIndex]);
				System.out.print(" | Author : "+author[bookIndex]);
				System.out.println();
			}
		}
	}
	
	int findBook(int userBookId){
		for(int bookIndex=0;bookIndex<bookId.length;bookIndex++){
			if(userBookId == bookId[bookIndex]){
				System.out.println("User Book ID : "+userBookId);
				System.out.println("Book ID : "+bookId[bookIndex]);
				return bookIndex;
			}
		}
		return bookId.length;
	}
}
