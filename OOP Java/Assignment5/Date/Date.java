import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.DayOfWeek;
import java.text.DateFormatSymbols;

class Date{
	private int day;
	private int month;
	private int year;

	Date(int day,int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}

	boolean isValid(){
		if(year<0 || month<1 || month>12 || day<1 || day>31) return false;
		int maxDays = 31;
		
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				maxDays = 30;
				break;
			case 2:
				maxDays = isLeapYear()?29:28;
				break;
		}
		
		return day <= maxDays;
	}

	//int getDayOfWeek(){
	String getDayOfWeek(){
	
		/*LocalDate localDate = localDate.of(year,month,day);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		return dayOfWeek.toString();*/
		
		String[] daysOfWeek = new DateFormatSymbols(Locale.ENGLISH).getWeekdays();		

		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month-1,day);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		//return (dayOfWeek+5)%7;

		return daysOfWeek[dayOfWeek];
		
	}

	boolean isLeapYear(){
		return (year%4==0 && year%100!=0) || year%400==0;
	}

	Date getNextDay(){
		int nextDay = day+1;
		int nextMonth=month;
		int nextYear=year;
		
		if(nextDay>getDaysInMonth(month,year)){
			nextDay=1;
			nextMonth++;
			
			if(nextMonth>12){
				nextMonth=1;
				nextYear++;
			}
		}
		
		return new Date(nextDay, nextMonth, nextYear);
	}

	Date getPreviousDay(){
		int prevDay=day-1;
		int prevMonth=month;
		int prevYear=year;

		if(prevDay<1){
			prevMonth--;
			
			if(prevMonth<1){
				prevMonth=12;
				prevYear--;
			}
			
			prevDay=getDaysInMonth(prevMonth,prevYear);
		}

		return new Date(prevDay,prevMonth,prevYear);
	}

	private int getDaysInMonth(int month,int year){
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return isLeapYear() ? 29:28;
			default:
				return 31;
		}
	}

	public String toString(){
		/*
		LocalDate localDate = LocalDate.of(year,month,day);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		return localDate.format(formatter);
		*/

		return String.format("%02d-%02d-%04d",day,month,year);
	}
}