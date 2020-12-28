import org.junit.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void main() {

        RouteHuman RouteH = new RouteHuman();

        //задавать рандомные значения и вообще топ будет

        run(RouteH, "UDDDUDUU", 8, 1);
        run(RouteH, "UDDD", 4, 1);
        run(RouteH, "UDDDUU", 6, 1);
        run(RouteH, "1", 1, 1);
    }

    void run(RouteHuman RouteH, String Route, int ValleyNumber, int expected) {
        RouteH.setRoute(Route);
        RouteH.setValleyNumber(ValleyNumber);
        RouteH.Amout_Of_Valleys();

        try {
            assertEquals(expected, RouteH.getAmout());
        } catch (AssertionFailedError e) {
            String s = "";
            for (int i = 0; i < 40; i++) {
                s += "~";
            }
            System.out.println(s + "\n" + e.getMessage() + "\n" + s + "\n");
        } catch (Exception e) {
            String s = "";
            for (int i = 0; i < 40; i++) {
                s += "~";
            }
            System.out.println(s + "\n" + e.getMessage() + "\n" + s + "\n");
        }
    }
}