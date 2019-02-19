import Stalls.CandyFloss;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossTest {

    CandyFloss candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFloss("Vata", "Eugen", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Vata", candyFloss.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Eugen", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, candyFloss.getParkingSpot());
    }

    @Test
    public void canSetGetRating(){
        candyFloss.setRating(3);
        assertEquals(3, candyFloss.getRating());
    }
}
