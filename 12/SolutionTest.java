import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void main() {
        Solution test =  new Solution();
        RouteHuman RouteH = new RouteHuman();

        int ValleyNumber = 8;
        String Route = "UDDDUDUU";

        RouteH.setRoute(Route);
        RouteH.setValleyNumber(ValleyNumber);

        RouteH.Amout_Of_Valleys();

        assertEquals(1,RouteH.getAmout());
    }
}