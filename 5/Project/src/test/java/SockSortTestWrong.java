import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockSortTestWrong {

    @Test
    void sockMerchant() {
        SockSort sockSort = new SockSort();
        int actual = sockSort.sockMerchant(5, new int[]{30, 40, 25, 77, 1});
        int expected = 2;
        assertEquals(expected, actual);
    }
}