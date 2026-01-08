package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnCorrectAmountWhenBelowBoundary() {
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectAmountWhenEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectAmountWhenAboveBoundary() {
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}
