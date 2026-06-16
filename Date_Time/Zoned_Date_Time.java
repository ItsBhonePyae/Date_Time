package Date_Time;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class Zoned_Date_Time {

	public static void main(String[] args) {
		
		ZonedDateTime TK = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo: "+ TK);
		
		ZonedDateTime YG = TK.withZoneSameInstant(ZoneId.of("Asia/Yangon"));
		System.out.println("Yangon: "  +YG);
		
		
		

	}

}
