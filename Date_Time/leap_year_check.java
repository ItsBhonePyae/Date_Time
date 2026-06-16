package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class leap_year_check {

	
	public static boolean check(String input) {
		try {
			LocalDate.parse(input);
			return true;
		} catch(DateTimeParseException e) {
			return false;
		}

		
	}
	public static void main(String[] args) {
		String datestring = "2024-02-29";
		
			System.out.println(datestring+" is_valid: "+check(datestring));
		
	}

}
