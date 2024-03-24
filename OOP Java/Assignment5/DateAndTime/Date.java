import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Date{

	private String dateInput;

	String setDate(Scanner sc){		
		System.out.print("Enter date (dd/mm/yyyy): ");
      		return dateInput = sc.nextLine();		
	}

	String getDate(){
		return dateInput;
	}
}

	//private int date,month,year;

		/*System.out.print("Enter Date : ");
		date=sc.nextInt();
		System.out.println();

		System.out.print("Enter Month : ");
		month=sc.nextInt();
		System.out.println();

		System.out.print("Enter Year : ");
		year=sc.nextInt();
		System.out.println();
		*/