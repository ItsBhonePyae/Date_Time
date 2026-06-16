package Date_Time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Set;


public class Business_days {

	public static long countbusinessdays(LocalDate from,LocalDate to,Set<LocalDate> weekend_businessdays,Set<LocalDate> holidays) {
		
		return from.datesUntil(to.plusDays(1))
			
				.filter(date -> {
					
					if(weekend_businessdays == null || weekend_businessdays.contains(date)) {
						return true;
					}
					DayOfWeek day = date.getDayOfWeek();
					return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;})
				.filter(date -> holidays == null || !holidays.contains(date))
				.count();
	}
	public static long countholidays(LocalDate from,LocalDate to,Set<LocalDate> holidays) {
		return from.datesUntil(to.plusDays(1))
				.filter(date -> {
					DayOfWeek day = date.getDayOfWeek();
					return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
				})
				.filter(date -> holidays == null || holidays.contains(date))
				.count();
	}
	
	
	public static void main(String[] args) {
		LocalDate from = LocalDate.of(2026, 1, 1);
		LocalDate to = LocalDate.of(2026,12,31);
	
		Set<LocalDate> weekend_businessdays  = Set.of(LocalDate.of(2026, 2, 22),
													LocalDate.of(2026, 11, 8));
		
		Set<LocalDate> holidays = Set.of(LocalDate.of(2026, 1, 1),
				LocalDate.of(2026, 1, 2),
				LocalDate.of(2026, 1, 4),
				LocalDate.of(2026, 2, 12),
				LocalDate.of(2026, 2, 13),
				LocalDate.of(2026, 2, 16),
				LocalDate.of(2026, 2, 17),
				LocalDate.of(2026, 3, 2),
				LocalDate.of(2026, 3, 27),
				LocalDate.of(2026, 4, 11),
				LocalDate.of(2026, 4, 12),
				LocalDate.of(2026, 4, 13),
				LocalDate.of(2026, 4, 14),
				LocalDate.of(2026, 4, 15),
				LocalDate.of(2026, 4, 16),
				LocalDate.of(2026, 4, 17),
				LocalDate.of(2026, 4, 18),
				LocalDate.of(2026, 4, 19),
				LocalDate.of(2026, 4, 30),
				LocalDate.of(2026, 5, 1),
				LocalDate.of(2026, 5, 28),
				LocalDate.of(2026, 7, 19),
				LocalDate.of(2026, 7, 29),
				LocalDate.of(2026, 10, 25),
				LocalDate.of(2026, 10, 26),
				LocalDate.of(2026, 10, 27),
				LocalDate.of(2026, 11, 23),
				LocalDate.of(2026, 11, 24),
				LocalDate.of(2026, 12, 4),
				LocalDate.of(2026, 12, 25));
		
		long businessdays = countbusinessdays(from,to,weekend_businessdays,holidays);
	
		System.out.println("Businessdays: "+businessdays);
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the start date: ");
		String in_date = sc.nextLine();
		
		LocalDate in_LocalDate = Dynamic_Date_parser.Object_parse_Date(in_date);
		long bds = countbusinessdays(in_LocalDate,to,weekend_businessdays,holidays);
		System.out.println("Businessdays: "+bds);
		
		long hds = countholidays(in_LocalDate,to,holidays);
		System.out.println("Holidays: " + hds);
		
		
		//The one that being taught in class
	/*	
		LocalDate d1 = LocalDate.of(2026, 1, 1);
		LocalDate d2 = LocalDate.now();
		
		long bd = 0;
		LocalDate date = d1;
		
		while(!date.isAfter(d2)) {
			if(date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
				bd++;
			}
		date =  date.plusDays(1);
		}
		System.out.println("Business days: " + bd);
		*/
		
	}

}
