import Attractions.Dodgems;
import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Visitor visitor;


    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Adrenaline");
        visitor = new Visitor(13, 150, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Adrenaline", rollercoaster.getName());
    }

    @Test
    public void hasRightAgeAndHeight(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
    @Test
    public void canSetGetRating(){
        rollercoaster.setRating(3);
        assertEquals(3, rollercoaster.getRating());
    }
}
