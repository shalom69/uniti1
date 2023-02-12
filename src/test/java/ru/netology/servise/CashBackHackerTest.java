package ru.netology.servise;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashBackHackerTest {
    @Test
    public void ShouldReturnZero() {

        CashBackHackerTest service = new CashBackHackerTest();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }
    

    @Test
    public void ShouldReturnHundred() {
        CashBackHackerTest service = new CashBackHackerTest();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
}
