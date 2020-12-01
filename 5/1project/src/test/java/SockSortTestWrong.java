import org.junit.Test;

import static org.junit.Assert.*;

public class SockSortTestWrong {

    @Test
    public void sockMerchant() {
        SockSort sockSort = new SockSort();
        int actual = sockSort.sockMerchant(5, new int[]{30, 40, 25, 77, 1});
        int expected = 2;
        assertEquals(expected, actual);
    }
}