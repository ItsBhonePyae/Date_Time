package Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class Period_Demo {
	public static void main(String[] args) {
		Period p1 = Period.ofYears(3);
		Period p2 = Period.ofMonths(2);
		Period p3 = Period.ofDays(4);
		
		Period pf = p1.plus(p2).plus(p3);
		System.out.println("Period: " + pf);
		
		LocalDate d1 =  LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2026, 1, 1);
		
		Period pb = Period.between(d1, d2);
		
		int h = pb.getYears();
		int m = pb.getMonths();
		int d = pb.getDays();
		System.out.println(String.format("%nPeriod: %d years, %d months, %d days",h,m,d));
	}
}
