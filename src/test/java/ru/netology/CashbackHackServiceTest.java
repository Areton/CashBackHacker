package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
     @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }


}
