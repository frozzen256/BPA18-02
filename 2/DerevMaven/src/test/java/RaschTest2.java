import static org.junit.Assert.*;

public class RaschTest2 {
    @org.junit.Test
    public void countApplesAndOranges() throws Exception {
        Rasch rasch = new Rasch();
        int actual = Rasch.countApplesAndOranges(3,18,5,10, new int[]{2, 10, -1, 5}, new int[]{5});
        int expected =5;
        assertEquals(expected,actual);

    }

}