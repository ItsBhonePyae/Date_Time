package Date_Time;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger(1);
		//Sample
		LocalDateTime ldt1 = LocalDateTime.of(2026, 06,11,13,30,45);
		System.out.println("Sample LocaDateTime: "+ ldt1);
		//format
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		String f_ldt = ldt1.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"Formatted: "+ f_ldt);
		//of(LocalDate,LocalTime)
		LocalDate d = LocalDate.of(2025, 12, 25);
		LocalTime t = LocalTime.of(10, 30,45);
		LocalDateTime ldt = LocalDateTime.of(d, t);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"of(LocalDate,LocalTime): "+ ldt);
		//withDayOfMonth()
		LocalDateTime test = Dynamic_Date_parser.Object_parse_Date_Time(f_ldt);
		LocalDateTime wd = test.withDayOfMonth(4);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withDayOfMonth: "+ wd);
		//withDayOfMonth_formatted
		String f_wd = wd.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withDayOfMonth_formatted: "+ f_wd);
		//withDayOfYear()
		LocalDateTime wy = test.withDayOfYear(365);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withDayOfYear: "+ wy);
		//withDayOfYear_formatted
		String f_wy = wy.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withDayOfYear_formatted: "+ f_wy);
		//withMonth()
		LocalDateTime wm = test.withMonth(3);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withMonth: "+ wm);
		//withMonth_formatted
		String f_wm = wm.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withDayOfMonth_formatted: "+ f_wm);
		//withHour()
		LocalDateTime wh = test.withHour(14);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withHour: "+ wh);
		//withHour_formatted
		String f_wh = wh.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withMonth_formatted: "+ f_wh);
		//wihtHour().withMinutes().withSeconds()
		LocalDateTime whwmws = test.withHour(15).withMinute(45).withSecond(25);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withHour.withMinute.withSecond: "+ whwmws);
		//withHour_withMinute_withSecond_formatted
		String f_whwmws = whwmws.format(formatter);
		System.out.println("\n" + counter.getAndIncrement()+ ". " +"withHour.withMinute.withSecond: "+ f_whwmws);
		//"And ta ku chin si kwell yay"
		
		
		
		
		
		
		
		
	}

}
