package Date_Time;
import java.time.Year;
public class YearDemo {

	public static void main(String[] args) {
		Year cy =  Year.now();
		System.out.println("Current Year: " + cy);
		
		Year y1 = Year.of(1947);
		Year y2 = Year.of(1999);
		boolean st = y1.isLeap();
		System.out.println("isLeap(): " + st);
		
		boolean st1 = Year.isLeap(2020);
		System.out.println("isLeap(): " + st1);
	
		int y1_days = y1.length();
		System.out.println("Length(): " + y1_days);
		
		int y2_days = y2.length();
		System.out.println("Length(): " +y2_days);
	}

}
