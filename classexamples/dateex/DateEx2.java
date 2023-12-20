package com.dateex;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

public class DateEx2 {
	
	public static void main(String[] args) {
		
//		LocalDate  localdate = LocalDate.now();
//		
//		System.out.println(localdate.getDayOfYear());
//		
//		System.out.println(localdate.isLeapYear());
//		
//		LocalTime localtime = LocalTime.now();
//		
//		System.out.println(localtime);
		
		//age Calculator
		
//		LocalDate birthdate = LocalDate.of(2000,01,18);
//				
//		LocalDate currentdate = LocalDate.now();
//		
//		Period p = Period.between(birthdate, currentdate);
//		
//		System.out.printf("ur age is:-%d years,%d months,%d days",p.getYears(),p.getMonths(),p.getDays());
//		
		
		System.out.println();
		
			ZoneId zone =ZoneId.of("America/Chicago");
			
			ZonedDateTime zt = ZonedDateTime.now(zone);
			
			Set  set = zone.getAvailableZoneIds();
			
			Iterator itr = set.iterator();
			
//			while(itr.hasNext()) {
//				System.out.println(itr.next());
//			}
			
			
			
			
			
			System.out.println(zt);
		
		
	}

}
