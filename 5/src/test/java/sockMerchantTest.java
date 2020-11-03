import static org.junit.Assert.*;

public class sockMerchantTest {

    @org.junit.Test
    public void sockMerchant1() {
        sockMerchant sockMerchant = new sockMerchant();
        int actual = sockMerchant.sockMerchant1(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int expected = 2;
        assertEquals(expected, actual);
    }
}