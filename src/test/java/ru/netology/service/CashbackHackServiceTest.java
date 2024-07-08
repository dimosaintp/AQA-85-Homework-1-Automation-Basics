package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviceIfAmountNull () {
        Assert.assertEquals(service.remain(0), 1_000);
    }

    @Test
    public void shouldAdviceIfAmountLessThanBoundary () {
        Assert.assertEquals(service.remain(800), 200);

    }

    @Test
    public void shouldAdviceIfAmountMoreThanBoundary () {
        Assert.assertEquals(service.remain(1200), 0);
    }
}