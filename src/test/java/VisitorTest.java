import org.junit.Before;
import org.junit.Test;
import Visitors.Visitor;
import static junit.framework.TestCase.assertEquals;


public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(15, 145, 100);
    }

    @Test
    public void hasAge(){
        assertEquals(15, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(145, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(100, visitor.getMoney());
    }
}
