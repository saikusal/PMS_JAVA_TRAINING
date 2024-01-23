import java.time.LocalDate;

public class DateTimeDemo {
	
	public static void main(String args[]) {
		
		LocalDate now = LocalDate.now();
		
		LocalDate customDate = LocalDate.of(2024, 1, 8);
		LocalDate parsedDate = LocalDate.parse("2023-12-02");
		
//		System.out.println(now);
//		System.out.println(customDate);
//		System.out.println(parsedDate);
		
//		System.out.println(now.getDayOfYear());
//		System.out.println(now.getMonth());
//		System.out.println(now.getMonthValue());
//		System.out.println(now.minusDays(12));
//		System.out.println(now.minusYears(12));
		System.out.println(now.plusDays(2));
		System.out.println(now.plusWeeks(34));
		
		System.out.println(now.isAfter(customDate));
		System.out.println(now.isBefore(customDate));
		System.out.println(now.isLeapYear());
		System.out.println(now.isEqual(now));
		System.out.println(now.lengthOfMonth());

	}

}
