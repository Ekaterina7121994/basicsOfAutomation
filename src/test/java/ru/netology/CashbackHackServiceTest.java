package ru.netology;

import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    @Test
    public void whenPurchaseLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenPurchaseEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenPurchaseMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenPurchaseLessBoundaryJUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenPurchaseEqualBoundaryJUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenPurchaseMoreBoundaryJUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        Assertions.assertEquals(expected, actual);
    }
}
