package Date_Time;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
public class DateTime_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input: ");
		String input = sc.nextLine();
		System.out.println(input + " is valid: " + isValidDate(input));
		

	}
	public static boolean isValidDate(String input) {
		try {
			LocalDate.parse(input);
			return true;
		}
		catch(DateTimeParseException e) {
			return false;
		}
	}

}
