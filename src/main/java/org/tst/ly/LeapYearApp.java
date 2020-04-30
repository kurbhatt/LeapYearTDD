package org.tst.ly;

public class LeapYearApp {

    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println(String.format("You need to plan for an extra day as %d is leap year", year));
        } else {
            System.out.println(String.format("No worries %d is not leap year", year));
        }
    }

    public static boolean isLeapYear(int year) {
        if (isValueDivisibleBy(year, 100)) {
            return isValueDivisibleBy(year, 400);
        } else {
            return isValueDivisibleBy(year,  4);
        }
    }

    private static boolean isValueDivisibleBy(int value, int divider) {
        return value % divider == 0;
    }
}
