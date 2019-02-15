
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Lista Circular
 */

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircularListTest {
        public CircularListTest() {
        }

        @BeforeClass
        public static void setUpClass() {
        }

        @AfterClass
        public static void tearDownClass() {
        }

        /**
         * Test del metodo RemoveFirst
         */
        @Test
        public void testRemoveFirst() {
            System.out.println("RemoveFirst");
            CircularList instance = new CircularList();
            Object expResult = "1";
            instance.addFirst("1");
            Object result = instance.removeFirst();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            if(!(result == expResult)){
                fail("No funciono");
            }
        }

        /**
         * Test del metodo push
         */
        @Test
        public void testPush() {
            System.out.println("Push");
            Object item = "1";
            CircularList instance = new CircularList();
            instance.push(item);
            String x = "1";
            Object result = instance.pop();
            assertEquals(result, x );
            // TODO review the generated test code and remove the default call to fail.
            if (!(result == x)){
                fail("No funciono");
            }
        }

        /**
         * Test del metodo pop
         */
        @Test
        public void testPop() {
            System.out.println("Pop");
            CircularList instance = new CircularList();
            Object expResult = "1";
            instance.push(expResult);
            Object result = instance.pop();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            if(!(result == expResult)){
                fail("No funciono");
            }
        }

}
