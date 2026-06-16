package Date_Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatting_and_Phrasing {

	public static void main(String[] args) {
		
		
		String localdate = "2024-12-25";
		LocalDate ld = LocalDate.parse(localdate);
		DateTimeFormatter ldf = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		String f_ld = ldf.format(ld);
		System.out.println(f_ld);
		
		String stringdate = "25-12-2024";
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		LocalDate date = LocalDate.parse(stringdate, inputFormatter);
		System.out.println("Original: "+ date);
		System.out.println("Formatted date: " + date.format(outputFormatter));
	}

}
