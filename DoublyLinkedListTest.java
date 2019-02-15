/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Lista Test Doble
 */
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

public class DoublyLinkedListTest {

    public DoublyLinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test del metodo de RemoveLast
     */
    @Test
    public void testRemoveLast() {
        System.out.println("Remove Last");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = "1";
        instance.addLast("1");
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test del metodo testGetFirst
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = "1";
        instance.addFirst("1");
        Object result = instance.getFirst();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.

        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test del metodo Push.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Object item = "1";
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.push(item);
        String x = "1";
        assertEquals(instance.peek(), x );
        if (!(instance.peek() == x)){
            fail("No funciono");
        }
    }

    /**
     * Test del metodo Pop
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = "1";
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        if(!(result == expResult)){
            fail("No funciono");
        }
    }
    /**
     * Test del metodo Peek
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = "1";
        instance.push("3");
        instance.push("1");
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }
}
