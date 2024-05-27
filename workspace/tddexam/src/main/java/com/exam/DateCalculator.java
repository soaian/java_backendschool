package com.exam;

import java.time.LocalDate;

public class DateCalculator {
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        return currentDate.getYear() - birthDate.getYear();
    }

    public int calculateDaysBetween(LocalDate day1, LocalDate day2) {
        return (int) day1.until(day2).getDays();
    }

    public boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year,1).isLeapYear();
    }
}
