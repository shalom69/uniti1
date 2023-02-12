import static org.junit.jupiter.api.Assertions.*;
class CashBackHackerTest {
      @Test
    void remain(int amount) {
        CashBackHackerTest service = new CashBackHackerTest();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturnHundred() {
        CashBackHackerTest service = new CashBackHackerTest();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
}
