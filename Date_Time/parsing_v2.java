package Date_Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class parsing_v2 {

	public static void main(String[] args) {
		String stringdate = "8,6,2026";
		
		DateTimeFormatter input = DateTimeFormatter.ofPattern("d,M,yyyy");
		DateTimeFormatter output = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
		
		LocalDate p_sd = LocalDate.parse(stringdate, input);
		
		System.out.println("Original: " + stringdate);
		System.out.println("Formatted: "+ p_sd.format(output));
		
	}

}
