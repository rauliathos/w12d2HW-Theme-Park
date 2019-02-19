import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Route66");
    }

    @Test
    public void hasName(){
        assertEquals("Route66", dodgems.getName());
    }

    @Test
    public void canSetGetRating(){
        dodgems.setRating(3);
        assertEquals(3, dodgems.getRating());
    }
}
