package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnCorrectAmountWhenBelowBoundary() {
        int actual = service.remain(999);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectAmountWhenEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectAmountWhenAboveBoundary() {
        int actual = service.remain(1001);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }
}
