package Date_Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.format.DateTimeFormatter;
import java.time.Month;
import java.time.DayOfWeek;


public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2026,06,10);
		LocalDate d2 = LocalDate.of(2026, 07, 05);
		AtomicInteger counter = new AtomicInteger(1);
		
		System.out.println("Sample date: " + d2);
		System.out.println("Another date: "+ d1);
		//atTime(int hour,int minutes)
		LocalDateTime dt = d1.atTime(4, 5);
		System.out.println("\n"+counter.getAndIncrement()+". "+"atTime(4,5): " +dt);
		//atStartOfDay()
		LocalDateTime sod = d1.atStartOfDay();
		System.out.println("\n"+counter.getAndIncrement()+". "+"atStartOfDay(): " + sod);
		//compareTo(LocalDate other)
		int comparison = d2.compareTo(d1);
		System.out.println("\n"+counter.getAndIncrement()+". "+"compareTo(): " + comparison);
		//format(DateTimeFormatter)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dtf1= d1.format(dtf);
		String dtf2 = d2.format(dtf);
		System.out.println("\n"+ counter.getAndIncrement()+". " + "format(dd/MM/yyyy): " + dtf1);
		System.out.println("   format(dd/MM/yyyy): " + dtf2);
		//getDayOfMonth()
		int dom = d1.getDayOfMonth();
		System.out.println("\n"+counter.getAndIncrement()+". "+ "getDayOfMonth(): " + dom);
		//getDayOfWeek()
		DayOfWeek dow = d1.getDayOfWeek();
		System.out.println("\n"+ counter.getAndIncrement()+". "+ "getDayOfWeek(): "+dow);
		//getDayOfYear()
		int doy = d1.getDayOfYear();
		System.out.println("\n"+ counter.getAndIncrement()+". " +"getDayOfYear(): "+ doy);
		//getMonth()
		Month mon = d1.getMonth(); 
		System.out.println("\n"+counter.getAndIncrement()+". "+ "getMonth(): " + mon);
		//getMonthValue()
		int mv = d1.getMonthValue();
		System.out.println("\n"+ counter.getAndIncrement()+". "+ "getMonthValue(): "+ mv);
		//getYear()
		int gay = d1.getYear();
		System.out.println("\n"+ counter.getAndIncrement()+". "+ "getYear(): "+ gay);
		//idLeapYear()
		boolean ly = d1.isLeapYear();
		System.out.println("\n" + counter.getAndIncrement()+". "+ "isLeapYear(): "+ ly);
		//isAfter(LocalDate other)
		boolean ia = d1.isAfter(d2);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "isAfter(): "+ ia);
		//isBefore()
		boolean ib = d1.isBefore(d2);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "isBefore(): "+ ib);
		//isEqual(LocalDate other)
		boolean ie = d1.isEqual(d2);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "isEqual(): "+ ie);
		//lengthOfMonth()
		int lom = d1.lengthOfMonth();
		System.out.println("\n" + counter.getAndIncrement()+". "+ "lengthOfMonth(): "+ lom);
		//lengthOfYear()
		int loy = d1.lengthOfYear();
		System.out.println("\n" + counter.getAndIncrement()+". "+ "lengthOfYear(): "+ loy);
		//now()
		LocalDate dn = LocalDate.now();
		System.out.println("\n" + counter.getAndIncrement()+". "+ "now(): "+ dn);
		//of() - already used above
		//plusDay()
		LocalDate dpd =  d1.plusDays(1);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "plusDays(): "+ dpd);
		//plusMonth()
		LocalDate dpm = d1.plusMonths(1);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "plusMonths(): "+ dpm);
		//plusWeek()
		LocalDate dpw = d1.plusWeeks(2);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "plusWeek(): "+ dpw);
		//plusYear()
		LocalDate dpy = d1.plusYears(1);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "plusYear(): "+ dpy);
		//WithDayOfMonth()
		LocalDate wdm =  d1.withDayOfMonth(4);
		System.out.println("\n" + counter.getAndIncrement()+". "+ "WithDayOfMonth(): "+ wdm);
	
	
	
	
	
	
	
	}

}
