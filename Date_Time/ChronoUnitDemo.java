package Date_Time;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.Duration;
public class ChronoUnitDemo {

	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger(1);
		for(ChronoUnit cu : ChronoUnit.values()) {
			System.out.println( counter.getAndIncrement()+". "+"Available ChronoUnit: "+cu);
		}
		
		LocalDate d1 =LocalDate.of(2026, 1, 1);
		LocalDate d2 = LocalDate.of(2026, 12, 31);
		
		long days = ChronoUnit.DAYS.between(d1, d2);
		System.out.println("\nDays between: " + days);
		
		long months = ChronoUnit.MONTHS.between(d1, d2);
		System.out.println("\nMonth between: " + months);
		
		long years = ChronoUnit.YEARS.between(d1, d2);
		System.out.println("\nYears between: " + years);
		
		long weeks = ChronoUnit.WEEKS.between(d1, d2);
		System.out.println("\nWeeks between: " + weeks);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Local Date Time now: " + now);
		
		LocalDateTime addweek = ChronoUnit.WEEKS.addTo(now, 1);
		System.out.println("\nNext Week: " + addweek);
				
		LocalDateTime addhour = ChronoUnit.HOURS.addTo(now, 4);
		System.out.println("\nIn 4 Hours: " + addhour);
		
		Duration duration = ChronoUnit.DAYS.getDuration();
		System.out.println("\nOne Day in Seconds: "+ duration.getSeconds());
		System.out.println("\nOne Day in Minutes: "+ duration.toMinutes());
		System.out.println("\nOne Day in Hours: "+ duration.toHours());
		
		Duration yearduration = ChronoUnit.YEARS.getDuration();
		System.out.println("\nOne Years in Days: "+ yearduration.toDays());
		
//		Duration monthduration = ChronoUnit.MONTHS.getDuration();
		
		LocalDate bd = LocalDate.of(2007, 1, 4);
		LocalDate bdnow = LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(bd, bdnow);
		long mon = ChronoUnit.MONTHS.between(bd, bdnow);
		long yea= ChronoUnit.YEARS.between(bd, bdnow);
		System.out.println("/nDays between " + bd + " and " + bdnow + ": " +yea+" years "+(mon-(yea*12))+" months "+(daysBetween-(yea*365)) + " days ");
		
		LocalDateTime t_now = LocalDateTime.now();
		LocalDateTime Deadline_Date = LocalDateTime.of(2026,12,31,23,59);
		
		
		long dl_days = ChronoUnit.DAYS.between(Deadline_Date, t_now);
		long dl_hours = ChronoUnit.HOURS.between(Deadline_Date,t_now);
		
		System.out.println("/nDays left: " + Math.abs(dl_days)+" days" +"\nHours left: " + Math.abs(dl_hours)+" hours");
		
	}

}
