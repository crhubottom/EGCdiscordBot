package com.egc.util;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaysOfWeekGroup {
    /**
     *  List of every DayOfWeek
     */ 
    public static final List<DayOfWeek> EVERYDAY = Arrays.asList(
        DayOfWeek.MONDAY,
        DayOfWeek.TUESDAY,
        DayOfWeek.WEDNESDAY,
        DayOfWeek.THURSDAY,
        DayOfWeek.FRIDAY,
        DayOfWeek.SATURDAY,
        DayOfWeek.SUNDAY
    );

    /*
     * List of every DayOfWeek from Monday to Friday inclusive
     */
    public static final List<DayOfWeek> WEEKDAYS = Arrays.asList(
        DayOfWeek.MONDAY,
        DayOfWeek.TUESDAY,
        DayOfWeek.WEDNESDAY,
        DayOfWeek.THURSDAY,
        DayOfWeek.FRIDAY
    );
    
    /*
     * List of DayOfWeek Saturday and Sunday
     */
    public static final List<DayOfWeek> WEEKEND = Arrays.asList(
        DayOfWeek.SATURDAY,
        DayOfWeek.SUNDAY
    );

    /**
     * Converts single letter days to a list of DayOfWeek
     * <p>
     * Sunday = U, Monday = M, Tuesday = T, Wednesday = W, Thursday = U, Friday = F, Saturday = S
     * @param days
     * @return
     */
    public static List<DayOfWeek> convertDaysLetterToDaysOfWeek(String days) {
        List<DayOfWeek> days_converted = new ArrayList<>();
        for (int i = 0; i < days.length(); i++) {
            char c = days.charAt(i);
            if(c == 'M'){
                days_converted.add(DayOfWeek.MONDAY);
            }
            if(c == 'T'){
                days_converted.add(DayOfWeek.TUESDAY);
            }
            if(c == 'W'){
                days_converted.add(DayOfWeek.WEDNESDAY);
            }
            if(c == 'R'){
                days_converted.add(DayOfWeek.THURSDAY);
            }
            if(c == 'F'){
                days_converted.add(DayOfWeek.FRIDAY);
            }
            if(c == 'S'){
                days_converted.add(DayOfWeek.FRIDAY);
            }
            if(c == 'U'){
                days_converted.add(DayOfWeek.SUNDAY);
            }
        }
        return days_converted;
    }
}
