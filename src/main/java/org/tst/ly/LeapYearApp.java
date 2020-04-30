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
        if (isDivisibleBy100(year)) {
            return isDivisibleBy400(year);
        }
        return false;
    }

    public static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    public static boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }
}
