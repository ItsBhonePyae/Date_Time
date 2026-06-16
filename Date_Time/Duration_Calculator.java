package Date_Time;
import java.time.Duration;
import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
public class Duration_Calculator {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(9, 30,0);
		LocalTime t2 = LocalTime.of(17, 45,30);
		
		
		Duration duration = Duration.between(t1, t2); // Needed to change it to String
		/*DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String f_d = d.format(duration); */
		
		System.out.println(String.format("Duration: %d hours, %d minutes, %d seconds", duration.toHours(),(-duration.toHours()*60+duration.toMinutes()),(-duration.toMinutes()*60+duration.toSeconds())));
		
		long hour = duration.toHours();
		long minutes = duration.toMinutes();
		long second = duration.toSeconds();
		
		System.out.println(String.format("Duration: %d hours, %d minutes, %d seconds", hour,(minutes-hour*60),(second-minutes*60)));
		
		
		
		
	}

}
