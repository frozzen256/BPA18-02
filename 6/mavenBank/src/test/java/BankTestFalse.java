import org.junit.Test;

import static org.junit.Assert.*;

public class BankTestFalse {

    @Test
    public void activityNotifications() {
        Bank bank = new Bank(new int[]{11,1,3,9,10,6});
        int actual = bank.activityNotifications(6,3, new int[]{11,1,3,9,10,6});
        int expected = 2;
        assertEquals(expected,actual);
    }
}