package com.java.programme;
/*
To find out given year is a leap year or not
 */
public class LeapYear {
    private boolean validateLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void validateLeapYearOrNot(int year){
        System.out.println("Leap year or not : "+validateLeapYear(year));
    }
}
