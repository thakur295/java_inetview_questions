package com.practice.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NewDateTimeExample {
	
	public static void main(String[] args) {
		
			LocalDate localDate = LocalDate.now();
			System.out.println(localDate);
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime);
			
			ZonedDateTime zoneTime = ZonedDateTime.now();
			System.out.println(zoneTime);
			
			ZoneId.getAvailableZoneIds().stream()
			.filter(zone -> zone.contains("Asia"))
			.collect(Collectors.toList()).forEach(z->System.out.println(z));
			
			LocalDateTime localDateTimeKorea = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
			LocalDateTime localDateTimeIndia = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
			System.out.println(localDateTimeKorea);
			System.out.println(localDateTimeIndia);
			
			//Duration duration = localDateTimeKorea.
		
		}
	
	}


