package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.time.format.DateTimeParseException;
import java.time.ZonedDateTime;
import java.util.List;

public class Dynamic_Date_parser {
	//Just the Objects of DateTimeFormatter
	public static final DateTimeFormatter Dynamic_Formatter_LocalDate = new DateTimeFormatterBuilder()
			.appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            .appendOptional(DateTimeFormatter.ofPattern("dd,MM,yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy,MM,dd"))
            .appendOptional(DateTimeFormatter.ofPattern("dd MM yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy MM dd"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy M d"))
            .appendOptional(DateTimeFormatter.ofPattern("yy M d"))
            .appendOptional(DateTimeFormatter.ofPattern("d M yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("d M yy"))
            .toFormatter();
	
	public static final DateTimeFormatter Dynamic_Formatter_LocalDateTime = new DateTimeFormatterBuilder()
			.append(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a"))
			.toFormatter();
	
	public static LocalDate Object_parse_Date(String input) {
		try {
		return LocalDate.parse(input,Dynamic_Formatter_LocalDate);
		}	catch(Exception e) {
			throw new IllegalArgumentException("Unsupported Date Format: " + input);
		}
			
	}
	
	public static LocalDateTime Object_parse_Date_Time(String input) {
		try {
		return LocalDateTime.parse(input,Dynamic_Formatter_LocalDateTime);
		}	catch(Exception e) {
			throw new IllegalArgumentException("Unsupported Date Format: " + input);
		}	
	}
	
	//Using List(Only One)
	private static final List<DateTimeFormatter> Dynamic_Date_Time_Formatter_List =  List.of(
			DateTimeFormatter.ofPattern("yyyy-MM-dd"),
			DateTimeFormatter.ofPattern("dd-MM-yyyy"),
			DateTimeFormatter.ofPattern("yyyy,MM-,dd"),
			DateTimeFormatter.ofPattern("dd,MM,yyyy"),
			DateTimeFormatter.ofPattern("yyyy/MM/dd"),
			DateTimeFormatter.ofPattern("dd/MM/yyyy"),
			DateTimeFormatter.ofPattern("yyyy MM dd"),
			DateTimeFormatter.ofPattern("dd MM yyyy"),
			DateTimeFormatter.ofPattern("hh:mm:ss"),
			DateTimeFormatter.ofPattern("hh:mm"),
			DateTimeFormatter.ofPattern("hh:mm:ss a"),
			DateTimeFormatter.ofPattern("hh:mm a"),
			DateTimeFormatter.ofPattern("a hh:mm:ss"),
			DateTimeFormatter.ofPattern("a hh:mm"),
			DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a"),
			DateTimeFormatter.ofPattern("hh:mm:ss a dd/MM/yyyy"));
	
	
	private static TemporalAccessor ParseToTemporal(String input) {
		for(DateTimeFormatter formatter : Dynamic_Date_Time_Formatter_List) {
			
			// ZonedDateTime //Havn't got any clue yet
			/*
			try {
				return formatter.parseBest(input,ZonedDateTime::from,ZonedDateTime::from);
			}catch(Exception e) {
				
			}
			*/
			try {
				return formatter.parseBest(input, LocalDateTime::from, LocalDateTime::from);
			}
				catch(Exception e) {	
				}
			try {
				return formatter.parse(input,LocalDate::from);
			}catch(DateTimeParseException ignored) {}
			try {
				return formatter.parse(input,LocalTime::from);
			}catch(DateTimeParseException ignored) {}
		}
		throw new IllegalArgumentException("Unsupported Date Format: "+ input);
	}
	public static ZonedDateTime List_Parse_ZonedDateTime(String input) {
		return (ZonedDateTime) ParseToTemporal(input);
	}	
	public static LocalDate List_Parse_Date(String input) {
		return (LocalDate) ParseToTemporal(input);
	}
	public static LocalDateTime List_Parse_Date_Time(String input) {
		return (LocalDateTime) ParseToTemporal(input);
	}
	public static LocalTime List_Parse_Time(String input) {
		return (LocalTime) ParseToTemporal(input);
	}
}
