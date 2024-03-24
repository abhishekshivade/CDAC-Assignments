import java.util.Scanner;

class Time{
	private String timeInput;

	String setTime(Scanner sc){
		

		
		System.out.print("Enter time (hh:mm:ss): ");
        	return timeInput = sc.nextLine();
	}

	String getTime(){
		return timeInput;	}
}



	//private int hour,minute,seconds;
		/*System.out.print("Enter Hour (24 hrs) : ");
		hour=sc.nextInt();
		System.out.println();

		System.out.print("Enter Minute : ");
		minute=sc.nextInt();
		System.out.println();

		System.out.print("Enter Seconds : ");
		seconds=sc.nextInt();
		System.out.println();
		*/