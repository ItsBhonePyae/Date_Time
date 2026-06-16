package Date_Time;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Assignment_Birthdays {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Birthday: ");
		String bday = sc.nextLine();	
	
		LocalDate ld_bday = Dynamic_Date_parser.List_Parse_Date(bday);
		LocalDate now = LocalDate.now();
		DayOfWeek dw_bday = ld_bday.getDayOfWeek();
		long age = ChronoUnit.YEARS.between(ld_bday, now);
		LocalDate next_bday = ChronoUnit.YEARS.addTo(ld_bday, age);
		long days_until = ChronoUnit.DAYS.between(next_bday, now);
		
		System.out.println("Day of Week being born: " + dw_bday);
		System.out.println("Current age in years: " + age);
		System.out.println("Next birthday: " + next_bday);
		System.out.println("Days until next birthday: " + days_until);
		
	}

}
