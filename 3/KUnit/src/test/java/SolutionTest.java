import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.ParentRunner;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {0, 3, 4, 2, "YES"},
            {0, 2, 5, 3, "NO"}
        });
    }

    int x1;
    int v1;
    int x2;
    int v2;
    String expected;

    public SolutionTest(int x1, int v1, int x2, int v2, String expected) {
        this.x1 = x1;
        this.v1 = v1;
        this.x2 = x2;
        this.v2 = v2;
        this.expected = expected;
    }

    @Test
    public void kangaroo() {
        Solution slt = new Solution();
        String actual = slt.kangaroo(x1, v1, x2, v2);
        String expected = this.expected;
        assertEquals(expected,actual);
    }
}