import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Test de clase SinglyLinkedList
 */
public class SinglyLinkedListTest {

    public SinglyLinkedListTest() {
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
     * Test del metodo RemoveFirst.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst("1");
        Object expResult = "1";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }

    /**
     * Test del metodo GetFirst
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = "1";
        instance.addFirst("1");
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }



    /**
     * Test del metodo Contains
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }

    /**
     * Test del metodo push
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "1";
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.push(item);
        String x = "1";
        assertEquals(instance.peek(), x );
        // TODO review the generated test code and remove the default call to fail.
        if (!(instance.peek() == x)){
            fail("Error");
        }
    }

    /**
     * Test del metodo pop
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = "1";
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }

    /**
     * Test del metodo peek
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = "1";
        instance.push("3");
        instance.push("1");
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }


    /**
     * Test del metodo Size
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("Error");
        }
    }


}