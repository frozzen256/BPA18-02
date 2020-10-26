import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void kangaroo() {
        Solution slt = new Solution();
        String acttual = slt.kangaroo(0,3,4,2);
        String excpected = "YES";
        assertEquals(excpected,acttual);
    }
}