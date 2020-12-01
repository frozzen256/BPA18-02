import static org.junit.Assert.*;

public class SockSortTestRight {

    @org.junit.Test
    public void sockMerchant() {
        SockSort sockSort = new SockSort();
        int actual = sockSort.sockMerchant(9,new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int expected = 2;
        assertEquals(expected, actual);
    }
}