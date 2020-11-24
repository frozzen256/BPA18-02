import static org.junit.Assert.*;

public class BankTest {

    @org.junit.Test
    public void activityNotifications() {
        Bank bank = new Bank(new int[]{2,3,4,2,3,6,7,4,5});
        int actual = bank.activityNotifications(9,5, new int[]{2,3,4,2,3,6,7,4,5});
        int expected = 2;
        assertEquals(expected,actual);
    }
}