package sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class KetoCalc {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(1982, Month.AUGUST, 31);
		LocalDate endDate =LocalDate.of(2016, Month.NOVEMBER, 9);
		System.out.println(startDate);
        System.out.println(endDate);
     // count between dates
        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
		System.out.println(weeks+ "weeks");
		System.out.println(weeksInCalendar(YearMonth.now()));
		//LocalDate today = startDate;
		//LocalDate day = endDate; 
	}
//
//	public static Period ofWeeks() {
//		// TODO Auto-generated method stub
//		LocalDate startDate= LocalDate.of(1982, 31, 10);
//		LocalDate endDate=LocalDate.of(2014, 31, 10);
//		System.out.println(startDate);
//        System.out.println(endDate);
//     // count between dates
//        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
//		System.out.println(weeks+ "weeks");
//		
//		
//		
//		Period period = Period.ofWeeks((int) weeks);
//		System.out.println(weeks + " weeks");
//		return period; 
//	}

	private static List<LocalDate> weeksInCalendar(YearMonth startDate) {
		// TODO Auto-generated method stub
		
		List<LocalDate> firstDaysOfWeeks = new ArrayList<>();
		
		for (LocalDate day = firstDayOfCalendar(startDate); stillInCalendar(startDate, day); day = day
		        .plusWeeks(1)) {
			firstDaysOfWeeks.add(day);
		    }
		LocalDate startDate1 = LocalDate.of(1982, Month.AUGUST, 31);
		// LocalDate today1 = startDate;
		// LocalDate day = endDate; 
		    return firstDaysOfWeeks;
	}
	
	private static LocalDate firstDayOfCalendar(YearMonth month) {
	    DayOfWeek FIRST_DAY_OF_WEEK = DayOfWeek.MONDAY;
	    return month.atDay(1).with(FIRST_DAY_OF_WEEK);
	  }
	
	private static boolean stillInCalendar(YearMonth yearMonth, LocalDate day) {
	    return !day.isAfter(yearMonth.atEndOfMonth());
	  }

}
