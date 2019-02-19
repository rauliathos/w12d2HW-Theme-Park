import Attractions.Dodgems;
import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("BabyPark");
        visitor = new Visitor(8, 120, 0);
    }

    @Test
    public void hasName(){
        assertEquals("BabyPark", playground.getName());
    }

    @Test
    public void hasSecurity(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void canSetGetRating(){
        playground.setRating(3);
        assertEquals(3, playground.getRating());
    }

}
