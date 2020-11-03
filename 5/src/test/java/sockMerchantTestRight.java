import org.junit.Test;

import static org.junit.Assert.*;

public class sockMerchantTestRight {

    @Test
    public void sockMerchant1() {
        sockMerchant sockMerchant = new sockMerchant();
        int actual = sockMerchant.sockMerchant1(5, new int[]{30, 40, 25, 77, 1});
        int expected = 2;
        assertEquals(expected, actual);
    }
}