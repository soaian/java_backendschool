package com.exam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void  setUp(){
        dateCalculator = new DateCalculator();

    }

    @Test
    void testCalculateAge(){
        LocalDate birthDate = LocalDate.of(1990,5,15);
        LocalDate currentDate = LocalDate.of(2022,2,28);
        int expectedAge = 32;
        int actualAge = dateCalculator.calculateAge(birthDate,currentDate);
        assertEquals(expectedAge,actualAge);
    }

    @Test
    void testCalculateDaysBetween(){
        LocalDate day1 = LocalDate.of(2020,5,1);
        LocalDate day2 = LocalDate.of(2020,5,28);
        int expectedDay = 27;
        int actualDay = dateCalculator.calculateDaysBetween(day1,day2);
        assertEquals(expectedDay,actualDay);
    }

    @Test
    void isLeapYear(){
        int leapYear = 2024;
        boolean isLeap = dateCalculator.isLeapYear(leapYear);
        assertEquals(true,isLeap);

    }

    @Test
    void


}
