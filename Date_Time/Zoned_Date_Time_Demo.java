package Date_Time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoned_Date_Time_Demo {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Current Zone Date and Time: "  + zdt);
	
		ZonedDateTime tk = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("\nTokyo Time: " + tk);
		
		ZonedDateTime ny = tk.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("\nNew York Time " + ny);
	
		System.out.println("\nOffset of New York: " + ny.getOffset());
		
		
		ZonedDateTime pr = tk.withZoneSameInstant(ZoneId.of("Europe/Paris"));
		System.out.println("\nParis Time " + pr);
		
		ZonedDateTime p_zdt=  ZonedDateTime.parse("2026-06-12T05:27:10.858797300+02:00[Europe/Paris]");
		System.out.println("\nPared: " +p_zdt);
		/*
		String test_zdt_str = "2026-06-12 05:27:10[Europe/Paris]";
		ZonedDateTime test_zdt = Dynamic_Date_parser.List_Parse_ZonedDateTime(test_zdt_str);
		System.out.println(test_zdt);
		*/
	}

}
