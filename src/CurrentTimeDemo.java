import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class CurrentTimeDemo {
	
	public static void main(String args[]) {
		
		LocalTime current = LocalTime.now();
		
		LocalTime customTime = LocalTime.of(14, 23);
		LocalTime parsedTime = LocalTime.parse("10:51:19");
		Instant instant1 = Instant.now();
		System.out.println(instant1.getEpochSecond());
		System.out.println(instant1.isSupported(ChronoField.MILLI_OF_DAY));
		


		System.out.println(current);
//		System.out.println(current.getHour());
//		System.out.println(customTime);
//		System.out.println(parsedTime);
//		System.out.println(current.getMinute());
//		System.out.println(current.getNano());
//		System.out.println(current.isAfter(parsedTime));
//		System.out.println(current.isBefore(parsedTime));
//		
//		LocalDateTime currentDt= LocalDateTime.now();
//		LocalDateTime customeDt = LocalDateTime.of(2024, 01, 10,11, 01);
//		LocalDateTime parsedDt = LocalDateTime.parse("2024-01-10T11:02:00");
//		
//		System.out.println(currentDt);
//		System.out.println(customeDt);
//		System.out.println(parsedDt);
//		System.out.println(currentDt.getDayOfMonth());
		
		
	}
}
