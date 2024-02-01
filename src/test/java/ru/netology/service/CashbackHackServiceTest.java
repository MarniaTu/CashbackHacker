package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAdditionalPurchaseAmountIfAmount900() {
        CashbackHackService service = new CashbackHackService();

        service.remain(900);

        assertEquals(service.remain(900), 100);

    }

    @Test
    public void shouldCalculateAdditionalPurchaseAmountIfAmount999() {
        CashbackHackService service = new CashbackHackService();

        service.remain(999);

        assertEquals(service.remain(999), 1);

    }

    @Test
    public void shouldNotCalculateAdditionalPurchaseAmountIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        service.remain(1000);

        assertEquals(service.remain(1000), 0);

    }

    @Test
    public void shouldCalculateAdditionalPurchaseAmountIfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        service.remain(1001);

        assertEquals(service.remain(1001), 999);

    }

    @Test
    public void shouldCalculateAdditionalPurchaseAmountIfAmountZero() {
        CashbackHackService service = new CashbackHackService();

        service.remain(0);

        assertEquals(service.remain(0), 1000);

    }

}
