import org.junit.*;

import static org.junit.Assert.*;

public class ArrayTest {
    private Array array;
    @Before
    public void setUp(){
        array = new Array(15);
    }

    @Test
    public void getCapacityTest(){
        assertEquals(15,array.getCapacity());
    }

    @Test
    public void getSizeTest(){
        assertEquals(0,array.getSize());
    }

    @Test
    public void isEmptyTest(){
        assertTrue(array.isEmpty());
    }

}
