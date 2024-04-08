import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Inventory{

	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		InputStreamReader inputReader= new InputStreamReader(System.in);
		BufferedReader reader= new BufferedReader(inputReader);

		Book book = new Book();
		int choice=0;

		do{
			System.out.println("How I can help you? Please select anyone option");
			
			System.out.println("1. Add new Book");
			System.out.println("2. Show Book");
			System.out.println("3. Increase Book Qunatity");
			System.out.println("4. Decrease Book Qunatity");
			System.out.println("5. Get Inventory Value");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			System.out.println();

			if(choice>5) System.out.println("Please enter correct choice");
			else{

				switch(choice){
					case 1:
						System.out.print("Enter Title of Book : ");
						//book.setTitle(sc.nextLine());
						//sc.next();
						book.setTitle(reader.readLine());

						System.out.print("Enter Author of Book : ");
						//book.setAuthor(sc.nextLine());
						//sc.next();
						book.setAuthor(reader.readLine());
		
						System.out.print("Enter Publisher of Book : ");	
						//book.setPublisher(sc.nextLine());
						//sc.next();
						book.setPublisher(reader.readLine());

						System.out.print("Enter ISBN of Book : ");
						//book.setIsbn(sc.nextLine());
						//sc.next();
						book.setIsbn(reader.readLine());

						System.out.print("Enter Year of Book : ");
						book.setYear(sc.nextInt());
	
						System.out.print("Enter Price of Book : ");
						book.setPrice(sc.nextDouble());

						System.out.print("Enter Qunatity of Book : ");
						book.setQuantity(sc.nextInt());
					
						break;

					case 2:
						System.out.println("Book Information");
						book.showBook();
						break;

					case 3:
						System.out.println("Enter Quantity to add");
						book.increaseQuantity(sc.nextInt());
						break;

					case 4:
						System.out.println("Enter Quantity to subtract");
						book.decreaseQuanity(sc.nextInt());
						break;

					case 5:
						System.out.print("Inventory value : "+book.getInventoryValue());
						System.out.println();
						break;

					case 0:
						System.out.println("Thank You for Visiting us...!");
						System.out.println("Please, visit again");
						System.exit(0);
				}
			}
		}while(choice !=0);
		
	}
}