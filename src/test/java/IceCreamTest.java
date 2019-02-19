import Stalls.IceCream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamTest {

    IceCream icecream;

    @Before
    public void before(){
        icecream =new IceCream("Gelato", "Giuseppe", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Gelato", icecream.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Giuseppe", icecream.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, icecream.getParkingSpot());
    }

    @Test
    public void canSetGetRating(){
        icecream.setRating(3);
        assertEquals(3, icecream.getRating());
    }
}
