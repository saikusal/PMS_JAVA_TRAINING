import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo {
	
	public static void main(String args[]) {
		
		ZonedDateTime current = ZonedDateTime.now();
//		ZoneId.getAvailableZoneIds().forEach(n->System.out.println(n));
		ZonedDateTime custome = ZonedDateTime.of(2024, 1,10, 11, 8, 9, 9, ZoneId.of("America/Marigot"));
		System.out.println(custome);
		System.out.println(current);
		System.out.println(current.getZone());
		System.out.println(current.toEpochSecond());
	}

}
