package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//Created by Gitanjali Aher
public class HandleDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time : "+currentDateTime);
		
		LocalDate date1 = LocalDate.parse("2000-07-19");
		System.out.println("Current Date : "+date1); // setting date by passing String
		
		LocalDate date2 = LocalDate.of(1995, 9, 30);
		System.out.println("Current Date : "+date2); // setting date by passing Integer
		
		//Retrieving Yesterday and Tomorrow's date
		LocalDate Yesterday = currentDate.minusDays(1);
		System.out.println("Current Date : "+Yesterday);
		
		LocalDate Tomorrow = currentDate.plusDays(1);
		System.out.println("Current Date : "+Tomorrow);
		
		//is a Leap Year?
		System.out.println("is leap year? "+currentDate.isLeapYear());
		
		//changing date time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("date (dd-MM-yyyy) format : "+formattedDate);
		
		//handling zone
		ZonedDateTime zonedDate = ZonedDateTime.now();
		System.out.println("Date with zone : "+zonedDate);
		
		System.out.println("Current zone : "+zonedDate.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone = zonedDate.withZoneSameInstant(tokyo);
		System.out.println("tokyo zone : "+tokyoZone);

	}

}
