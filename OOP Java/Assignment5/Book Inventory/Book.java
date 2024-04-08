class Book{
	private String title, author, publisher, isbn;
	private int year, quantity;
	private double price;

	Book(){
		
	}

	void setTitle(String title){
		this.title=title;
	}
	
	String getTitle(){
		return this.title;
	}

	void setAuthor(String author){
		this.author=author;
	}
	
	String getAuthor(){
		return this.author;
	}

	void setPublisher(String publisher){
		this.publisher=publisher;
	}
	
	String getPublisher(){
		return this.publisher;
	}

	void setIsbn(String isbn){
		this.isbn=isbn;
	}
	
	String getIsbn(){
		return this.isbn;
	}

	void setYear(int year){
		this.year=year;
	}
	
	int getYear(){
		return this.year;
	}

	void setPrice(double price){
		this.price=price;
	}
	
	double getPrice(){
		return this.price;
	}

	void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	int getQuantitty(){
		return this.quantity;
	}

	void showBook(){
		System.out.println("Title 	: "+title);
		System.out.println("Author 	: "+author);
		System.out.println("Publisher 	: "+publisher);
		System.out.println("Isbn 	: "+isbn);
		System.out.println("Year 	: "+year);
		System.out.println("Price 	: "+price);
		System.out.println("Qunatity 	: "+quantity);
	}

	void increaseQuantity(int quantity){
		this.quantity+=quantity;
	}

	void decreaseQuanity(int quantity){
		this.quantity-=quantity;
	}

	double getInventoryValue(){
		return quantity*price;
	}
}