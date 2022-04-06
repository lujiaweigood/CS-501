

import java.util.GregorianCalendar;
public class C9E5GregorianCalender {

	public static void main(String[] args) {
		

		GregorianCalendar date = new GregorianCalendar();	
		

		System.out.println("The follwing program shows you the current date");
		System.out.println("Then it shows the date after an elapsed time of "+
						   "\n1234567898765 milliseconds starting at Jan 1, 1970\n");
		

		System.out.println("The current date is month/day/year");
		System.out.println("------------------------------------------------------------------");
		System.out.println(date.get(GregorianCalendar.MONTH) +1 + "/" + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + date.get(GregorianCalendar.YEAR));
		

		final long TIME = 1234567898765L;	
		date.setTimeInMillis(TIME);
	
		System.out.println("\nDate 1234567898765 milliseconds after 1/1/1970:");
		System.out.println("------------------------------------------------------------------");
		System.out.println(date.get(GregorianCalendar.MONTH) +1 + "/" + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + date.get(GregorianCalendar.YEAR));
		

	}

}
