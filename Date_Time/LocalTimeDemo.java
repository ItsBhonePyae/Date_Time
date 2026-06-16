package Date_Time;
import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.format.DateTimeFormatter;
public class LocalTimeDemo {

	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger(1);
		//Create sample
		LocalTime t1 = LocalTime.of(13, 45,30,123456789);
		System.out.println("Sample Time: " +t1);
		//getHour()
		int gh = t1.getHour();
		System.out.println("\n" +counter.getAndIncrement()+". " +"getHour(): " + gh);
		//getMinutes()
		int min = t1.getMinute();
		System.out.println("\n" +counter.getAndIncrement()+". " +"getMinute(): " + min);
		//getSecond()
		int sec = t1.getSecond();
		System.out.println("\n" +counter.getAndIncrement()+". " +"getSecond(): " + sec);
		//getNano()
		int ns = t1.getNano();
		System.out.println("\n" +counter.getAndIncrement()+". " +"getNano(): " + ns);
		//hashCode()
		int hc = t1.hashCode();
		System.out.println("\n" +counter.getAndIncrement()+". " +"hashCode(): " + hc);
		//minusMinutes()
		LocalTime mm = t1.minusMinutes(15);
		System.out.println("\n" +counter.getAndIncrement()+". " +"minusMinutes(): " + mm);
		//LocalTime of(h,m,s)
		LocalTime to = LocalTime.of(8,30,45);
		System.out.println("\n" +counter.getAndIncrement()+". " +"of(8,30,45): " + to);
		//LocalTime of(h,m,s,ns)
		LocalTime to1 = LocalTime.of(8, 30,45,50000000);
		System.out.println("\n" +counter.getAndIncrement()+". " +"of(8,30,45,50000000): " + to1);
		//LocalTime ofSecondOfDay()
		LocalTime sod = LocalTime.ofSecondOfDay(3665);
		System.out.println("\n" +counter.getAndIncrement()+". " +"ofSecondOfDay(3665): " + sod);
		//LocalTime parse(CharSequence)
		LocalTime p = LocalTime.parse("10:30:50");
		System.out.println("\n" +counter.getAndIncrement()+". " +"parse(10:30:50): " + p);
		//LocalTime parse(CharSequence, formatter)
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime tpf =  LocalTime.parse("14:30:50",tf);
		System.out.println("\n" +counter.getAndIncrement()+". " +"parse(14:30:50) with formatter: " + tpf);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
		String T_F = tpf.format(f);
		System.out.println("    12 hour Formatted: ヾ(＠⌒ー⌒＠)ノ " + T_F);
	}

}
