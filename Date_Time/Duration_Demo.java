package Date_Time;
import java.time.Duration;
import java.time.LocalTime;
public class Duration_Demo {

	public static void main(String[] args) {
		Duration  d1 = Duration.ofHours(2);
		Duration d2 = Duration.ofMinutes(45);
		Duration d3 = Duration.ofSeconds(30,500000000);
		
		System.out.println("2 hours = "+d1);
		System.out.println("45 minutes = "+d2);
		System.out.println("30.5 seconds = "+d3);
		
		Duration total = d1.plus(d2).plus(d3);
		System.out.println("\nSum = "+total);
		
		System.out.println("Total seconds: " + total.getSeconds());
		
		System.out.println("Total Nanos: "+ total.getNano());
		
		LocalTime t1 =  LocalTime.of(9, 0);
		LocalTime t2 =  LocalTime.of(17, 30);
		
		Duration d =  Duration.between(t1, t2);
		
		long h = d.toHours();
		long m = d.toMinutes();
		long s =d.toSeconds();
		System.out.println(String.format("%n Duration: %d hours, %d minutes, %d seconds",h,m,s));
	
		int h1 = d.toHoursPart();
		int m1 = d.toMinutesPart();
		int s1 =d.toSecondsPart();
		System.out.println(String.format("%n Duration: %d hours, %d minutes, %d seconds",h1,m1,s1));
	}

}
