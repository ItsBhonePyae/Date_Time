package Date_Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
                                                                                                                                                                                                                                                                       
public class Format_test {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		
		System.out.println("==========Before Formatting==========");
		System.out.println("Local Date: " + ld);
		System.out.println("Local Time: " + lt);
		System.out.println("Local Date Time: " + ldt);
		
		
		DateTimeFormatter dtf0 = DateTimeFormatter.ofPattern("EEE,yyyy-MM-dd");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss a");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd HH:mm:ss a");
		
		String formatted_ld  = dtf0.format(ld);
		String formatted_lt = dtf1.format(lt);
		String formatted_ldt = dtf2.format(ldt);
		
		
		System.out.println("==========After Formatting==========");
		System.out.println("Local Date: " + formatted_ld);
		System.out.println("Local Time: " + formatted_lt);
		System.out.println("Local Date Time: " + formatted_ldt);
		
		System.out.println("====================================");
		LocalDate future_date = ld.plusDays(10).plusMonths(3).plusYears(2);
		System.out.println("Today: " + ld);
		System.out.println("After 10 days, 3 months, and 2 years: " + future_date);
		
		System.out.println("====================================");
		LocalDate d1 = LocalDate.of(2023, 1, 1);
		LocalDate d2 = LocalDate.of(2025, 5, 6);
		long daysBetween = ChronoUnit.DAYS.between(d1, d2);
		long mon = ChronoUnit.MONTHS.between(d1, d2);
		long yea= ChronoUnit.YEARS.between(d1, d2);
		System.out.println("Days between " + d1 + " and " + d2 + ": " +yea+" years "+(mon-(yea*12))+" months "+(daysBetween-(yea*365)) + " days ");
		
		System.out.println("====================================");
		LocalDate birthdate = LocalDate.of(1997, 3, 28);
		LocalDate currentdate = LocalDate.now();
		
		Period age = Period.between(birthdate, currentdate); //you can use the Period class instead of ChoronoUnit
		System.out.printf("Age in years: %s, months: %s and days: %s",age.getYears(),age.getMonths(),age.getDays()); 
		
	}

}
