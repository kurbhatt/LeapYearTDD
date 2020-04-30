package org.tst.ly;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearAppTest {

    @Test
    public void isLeapYearTest() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2020);
        Assert.assertEquals(false, isLeapYear);
    }

    @Test
    public void isDivisibleBy400FailTest() {
        boolean isLeapYear = LeapYearApp.isLeapYear(2020);
        Assert.assertEquals(false, isLeapYear);
    }
}