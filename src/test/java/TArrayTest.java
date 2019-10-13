import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class TArrayTest {

    private TArray<Integer> array;

    @Before
    public void setUp(){
        array = new TArray<>(20);
    }

    @Test
    public void getCapacityTest(){
        assertEquals(20,array.getCapacity());
    }

    @Test
    public void getSizeTest(){
        assertEquals(0,array.getSize());
    }

    @Test
    public void isEmptyTest(){
        assertTrue(array.isEmpty());
    }

    @Test
    public void addTest(){
        for (int i = 0; i < 10; i++) {
            array.add(i,i);
        }
        assertEquals(10,array.getSize());
    }

    @Test
    public void addFirstTest(){
        array.addFirst(4);
        assertEquals(1,array.getSize());
    }

    @Test
    public void addLastTest(){
        array.addLast(5);
        assertEquals(1,array.getSize());
    }

    @Test
    public void getTest(){
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }

        assertEquals(4,(int)array.get(4));
    }

    @Test
    public void setTest(){
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.set(4,100);
        assertEquals(100,(int)array.get(4));
    }

    @Test
    public void containsTest(){
        for (int i = 0; i < 10; i++) {
             array.addLast(i);
        }
        assertTrue(array.contains(2));
        assertFalse(array.contains(12));
    }

    @Test
    public void findTest(){
        for (int i = 0; i < 10; i++) {
             array.addLast(i);
        }
        assertEquals(2,array.find(2));
        assertEquals(-1,array.find(30));
    }

    @Test
    public void removeTest(){
        for (int i = 0; i < 10; i++) {
             array.addLast(i);
        }
        array.remove(2);
        assertEquals(3,(int)array.get(2));
    }

    @Test
    public void removeFirstTest(){
        for (int i = 0; i < 10; i++) {
             array.addLast(i);
        }
        assertEquals(0,(int)array.removeFirst());
        assertEquals(1,(int)array.get(0));
    }

    @Test
    public void removeLastTest(){
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        assertEquals(9,(int)array.removeLast());
        assertEquals(8,(int)array.get(8));
    }

    @Test
    public void removeElementTest(){
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        assertEquals(3,(int)array.get(3));
        array.removeElement(3);
        assertEquals(4,(int)array.get(3));
    }




}
