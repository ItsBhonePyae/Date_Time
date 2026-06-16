package Date_Time;
import java.time.ZoneId;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
public class All_Zone_Id {

	public static void main(String[] args) {
		
		Set<String> zoneids = ZoneId.getAvailableZoneIds();
		AtomicInteger counter = new AtomicInteger(1);
		zoneids.stream().sorted().forEach(zone -> System.out.println(counter.getAndIncrement() + ". " + zone));

	}

}
