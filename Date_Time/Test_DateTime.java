package Date_Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Test_DateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		String f_ldt  = ldt.format(format);
		System.out.println(f_ldt);
		
		LocalDateTime p_ldt = Dynamic_Date_parser.List_Parse_Date_Time(f_ldt);
		System.out.println(p_ldt);
		
		String lt = "02:30 PM";
		LocalTime p_lt = Dynamic_Date_parser.List_Parse_Time(lt);
		System.out.println(p_lt);
	}

}
