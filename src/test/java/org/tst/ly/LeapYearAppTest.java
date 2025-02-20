package org.tst.ly;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearAppTest {

    @Test
    public void isLeapYearTest() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2020);
        Assert.assertEquals(true, isLeapYear);
    }

    @Test
    public void isDivisibleBy400PassTest() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2000);
        Assert.assertEquals(true, isLeapYear);
    }

    @Test
    public void isDivisibleBy100Test() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2000);
        Assert.assertEquals(true, isLeapYear);
    }

    @Test
    public void isDivisibleBy4Test() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2008);
        Assert.assertEquals(true, isLeapYear);
    }
}