import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockSortTestRight {

    @Test
    void sockMerchant() {
        SockSort sockSort = new SockSort();
        int actual = sockSort.sockMerchant(9,new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int expected = 2;
        assertEquals(expected, actual);
    }
}