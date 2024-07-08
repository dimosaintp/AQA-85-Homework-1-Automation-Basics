package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviceIfAmountNull() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviceIfAmountLessThanBoundary() {
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldAdviceIfAmountMoreThanBoundary() {
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}