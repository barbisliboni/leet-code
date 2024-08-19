package src.main.java.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoField;

public class DateTimeTest {
    public static void main (String [] args) {

        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate); // 2024-08-19

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // 2024-08-19T19:12:09.309176100

        LocalDate ofYearDayDate = LocalDate.ofYearDay(2002, 20);
        System.out.println(ofYearDayDate);

        LocalDate todayDateMinusXDays = todayDate.minusDays(18);
        System.out.println(todayDateMinusXDays);

        LocalDate todayDateMinusXMonths = todayDate.minusMonths(12);
        System.out.println(todayDateMinusXMonths);

        LocalDate todayDateMinusXWeeks = todayDate.minusWeeks(4);
        System.out.println(todayDateMinusXWeeks);

        LocalDate todayDateMinusXYears = todayDate.minusYears(5);
        System.out.println(todayDateMinusXYears);

        LocalDate todayDatePlusXDays = todayDate.plusDays(12);
        System.out.println(todayDatePlusXDays);

        LocalDate todayDatePlusXMonths = todayDate.plusMonths(12);
        System.out.println(todayDatePlusXMonths);

        LocalDate todayDatePlusXWeeks = todayDate.plusWeeks(4);
        System.out.println(todayDatePlusXWeeks);

        LocalDate todayDatePlusXYears = todayDate.plusYears(5);
        System.out.println(todayDatePlusXYears);

        LocalDateTime todayTimeAtHHMMSS = LocalDate.now().atTime(5, 5, 5);
        System.out.println(todayTimeAtHHMMSS);

        LocalDateTime nowDateTimeMinusXHours = dateTime.minusHours(19);
        System.out.println(nowDateTimeMinusXHours);

        LocalDateTime nowDateTimeMinusXMinutes = dateTime.minusMinutes(60);
        System.out.println(nowDateTimeMinusXMinutes);

        LocalDateTime nowDateTimeMinusXSeconds = dateTime.minusSeconds(60);
        System.out.println(nowDateTimeMinusXSeconds);

        Integer todayDayOfYear = dateTime.getDayOfYear();
        System.out.println(todayDayOfYear); // 232

        Integer todayDayMonthValue = dateTime.getMonthValue();
        System.out.println(todayDayMonthValue); // 8

        Integer todayDayOfTheMonth = dateTime.getDayOfMonth();
        System.out.println(todayDayOfTheMonth); // 19

        DayOfWeek todayDayOfTheWeek = dateTime.getDayOfWeek();
        System.out.println(todayDayOfTheWeek.toString().toLowerCase()); // monday

        DayOfWeek todayOfTheWeekMinusXDays = todayDayOfTheWeek.minus(5);
        System.out.println(todayOfTheWeekMinusXDays.toString().toLowerCase()); // wednesday

        Chronology dateChronology = dateTime.getChronology();
        System.out.println(dateChronology); // ISO

        System.out.println(dateChronology.dateNow()); // 2024-08-19

        System.out.println(dateChronology.getCalendarType()); // iso8601

        System.out.println(dateChronology.isIsoBased()); // true

        System.out.println(dateChronology.getId()); // ISO

        System.out.println(dateChronology.hashCode()); // 666712691

        System.out.println(dateChronology.eras()); // [BCE, CE]

        System.out.println(dateChronology.period(2, 3, 4)); // P2Y3M4D

        ChronoField chronoWeek = ChronoField.DAY_OF_WEEK;

        System.out.println(dateChronology.range(chronoWeek)); // 1 - 7

        ChronoField chronoEpochDay = ChronoField.HOUR_OF_DAY;

        System.out.println(dateChronology.range(chronoEpochDay)); // 0 - 23


    }
}
