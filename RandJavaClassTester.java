import static org.junit.Assert.*;
import org.junit.*;

public class RandJavaClassTester {
    String name1, name2;

    @Before
    public void initTestCases() {
        name1 = "Aleksa";
        name2 = "Bob";
    }

    @Test
    public void testDouble() {
        RandJavaClass obj = new RandJavaClass(name1);
        assertEquals("Aleksa", obj.getName());
        obj.doubleName();
        assertEquals("AleksaAleksa", obj.getName());
        obj.doubleName();
        assertEquals("AleksaAleksaAleksaAleksa", obj.getName());
    }
    @Test
    public void testRemoveFirst() {
        RandJavaClass obj = new RandJavaClass(name2);
        assertEquals("Bob", obj.getName());
        obj.removeFirstLetterOfName();
        assertEquals("ob", obj.getName());
        obj.removeFirstLetterOfName();
        assertEquals("b", obj.getName());
    }
    @Test
    public void testRemoveLast() {
        RandJavaClass obj = new RandJavaClass(name2);
        assertEquals("Bob", obj.getName());
        obj.removeLastLetterOfName();
        assertEquals("Bo", obj.getName());
        obj.removeLastLetterOfName();
        assertEquals("B", obj.getName());
    }
}
