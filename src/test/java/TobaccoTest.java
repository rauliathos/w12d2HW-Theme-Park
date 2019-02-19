import Stalls.Tobacco;
import org.junit.Before;
import org.junit.Test;
import Visitors.Visitor;

import static junit.framework.TestCase.assertEquals;

public class TobaccoTest {
    Tobacco tobacco;
    Visitor visitor;
    Visitor visitorUnder18;

    @Before
    public void before(){
        tobacco = new Tobacco("Tutun", "Raul", 1);
        visitor = new Visitor(19,180, 100);
        visitorUnder18 = new Visitor(17, 190, 3000);
    }

    @Test
    public void hasName(){
        assertEquals("Tutun", tobacco.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Raul", tobacco.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, tobacco.getParkingSpot());
    }

    @Test
    public void hasTheRightAgeToBuyTobacco(){
        assertEquals(true, tobacco.isAllowedTo(visitor));
    }

    @Test
    public void isUnderAge(){
        assertEquals(false, tobacco.isAllowedTo(visitorUnder18));

    }
    @Test
    public void canSetGetRating(){
        tobacco.setRating(3);
        assertEquals(3, tobacco.getRating());
    }

}
