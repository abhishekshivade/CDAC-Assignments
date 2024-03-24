import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateAndTime{
	public static void main(String arg[]){
		Date date = new Date();
		Time time = new Time();

		Scanner sc = new Scanner(System.in);

		date.setDate(sc);
		String dateInput = date.getDate();

		time.setTime(sc);
		String timeInput=time.getTime();

		LocalDateTime dateTime = LocalDateTime.parse(dateInput+" "+ timeInput, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

		System.out.println("Date formats:");
	        System.out.println("1. dd/mm/yyyy: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        	System.out.println("2. mm/dd/yyyy: " + dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	        System.out.println("3. yyyy/mm/dd: " +  dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        
        	System.out.println("\nTime formats:");
	        System.out.println("1. hh:mm:ss: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        	System.out.println("2. hh:mm:ss a: " + dateTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
	        System.out.println("3. hh:mm: " + dateTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        
        	System.out.println("\nDate and Time formats:");
	        System.out.println("1. dd/mm/yyyy hh:mm:ss: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        	System.out.println("2. mm/dd/yyyy hh:mm:ss a: " + dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a")));
	        System.out.println("3. yyyy/mm/dd hh:mm: " + dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")));
		
		sc.close();
	}
}

