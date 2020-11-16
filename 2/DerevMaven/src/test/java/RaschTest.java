import static org.junit.Assert.*;

public class RaschTest {

    @org.junit.Test
    public void countApplesAndOranges() throws Exception {
        Rasch rasch = new Rasch();
            int actual = Rasch.countApplesAndOranges(7,11,5,15, new int[]{-2, 2, 1}, new int[]{5, -6});
            int expected =1;
            assertEquals(expected,actual);

    }
}