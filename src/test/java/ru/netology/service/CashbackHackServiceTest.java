package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviceIfAmountNull() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldAdviceIfAmountLessThanBoundary() {
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldAdviceIfAmountMoreThanBoundary() {
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}