import java.util.Scanner;

class DateImpl{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Date : ");
		int day = sc.nextInt();
		System.out.print("Enter Month : ");
		int month = sc.nextInt();
		System.out.print("Enter Year : ");
		int year = sc.nextInt();
		System.out.println();

		Date date=new Date(day,month,year);
		System.out.println(date.isValid());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.isLeapYear());
		
		Date nextDay=date.getNextDay();
		System.out.println(nextDay);
	
		Date prevDay=date.getPreviousDay();
		System.out.println(prevDay);
	}
}