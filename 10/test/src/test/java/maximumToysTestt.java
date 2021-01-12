import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maximumToysTestt {

    @Test
    void maximumToystest() {
        maximumToys clasToys = new maximumToys();
        int k = 50;
        int[] p = {1, 12, 5, 111, 200, 1000, 10};
        int res = clasToys.maximumToystest(p ,k);
        int expected = 4;
        assertEquals(expected,res);
    }
}