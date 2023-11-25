package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void whenPurchaseLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenPurchaseEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenPurchaseMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(actual, expected);
    }
}
