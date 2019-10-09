import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ArrayTest {

    private Array array;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

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
        array = new Array();
        assertTrue(array.isEmpty());
    }
    @Test
    public void addTest(){
        try {
            array = new Array(2);
            array.add(0,1);
            array.add(1,2);
            array.add(2,3);
        }catch (IllegalArgumentException ex){
            assertEquals("Add failed. Array is full.",ex.getMessage());
        }

        try {
            array = new Array(15);
            array.add(16,16);
        }catch (IllegalArgumentException ex){
            assertEquals("Add failed. Require index >=0 and index <= size.",ex.getMessage());
        }

        array = new Array();
        array.add(0,1);
        array.add(1,2);
        array.add(2,3);
        array.add(3,4);
        array.add(4,5);

        assertEquals(5,array.getSize());
        assertEquals(10,array.getCapacity());
    }

    @Test
    public void addLastTest(){
        array.addLast(2);
        assertEquals(1,array.getSize());
    }
    @Test
    public void addFirstTest(){
        array.addFirst(1);
        assertEquals(1,array.getSize());
    }

    @Test
    public void getTest(){
        array.addFirst(1);
        assertEquals(1,array.get(0));
    }

    @Test
    public void setTest(){
        array.addFirst(1);
        array.add(1,2);
        array.add(2,3);
        array.add(3,4);
        array.addLast(5);
        array.set(3,10);
        assertEquals(10,array.get(3));
    }

    @Test
    public void containsTest() {
        array = new Array(20);
        for (int i = 0; i < 10; i++) {
             array.addLast(i);
        }
        assertTrue(array.contains(8));
        assertFalse(array.contains(12));
    }

    @Test
    public void findTest() {
        array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        assertEquals(6,array.find(6));
        assertTrue(array.find(6)>0);
        assertEquals(-1,array.find(12));
    }

    @Test
    public void removeTest(){
        array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.remove(6);
        assertEquals(9,array.getSize());
    }

    @Test
    public void  removeLastTest() {
        array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.removeLast();
        assertEquals(9,array.getSize());
    }

    @Test
    public void removeFirstTest(){
        array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.removeFisrt();
        assertEquals(9,array.getSize());
    }




}
