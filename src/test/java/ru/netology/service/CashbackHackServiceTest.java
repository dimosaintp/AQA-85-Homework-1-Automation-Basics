package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    //Тесты с использованием API JUnit Jupiter
    
    @Test
    public void shouldAdviceIfAmountNullAPIJUnitJupiter() {
    assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldAdviceIfAmountLessThanBoundaryAPIJUnitJupiter() {
       assertEquals(200, service.remain(800));
    }

    //Тест написан кратко
    @Test
    public void shouldAdviceIfAmountMoreThanBoundaryAPIJUnitJupiter() {
        assertEquals(0, service.remain(1200));
    }
}